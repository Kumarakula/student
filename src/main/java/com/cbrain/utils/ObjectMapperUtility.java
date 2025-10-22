package com.cbrain.utils;

import com.cbrain.controller.dto.StudentRequestDto;
import com.cbrain.controller.dto.StudentResponseDto;
import com.cbrain.controller.dto.SubjectRequestDto;
import com.cbrain.controller.dto.SubjectResponseDto;
import com.cbrain.repository.entity.StudentEntity;
import com.cbrain.repository.entity.SubjectEntity;

import java.time.LocalDateTime;
import java.util.List;

public class ObjectMapperUtility {

    public static StudentResponseDto mapToStudentDto(StudentEntity studentEntity, List<SubjectEntity> subjectEntities) {
        return new StudentResponseDto(
                studentEntity.getStudentId(),
                studentEntity.getStudentFirstName(),
                studentEntity.getStudentLastName(),
                studentEntity.getStudentAge(),
                studentEntity.getActiveStatus(),
                subjectEntities.stream()
                        .map(ObjectMapperUtility::mapToSubjectDto)
                        .toList()
        );
    }

    public static StudentResponseDto mapToStudentDto(StudentEntity studentEntity) {
        return new StudentResponseDto(
                studentEntity.getStudentId(),
                studentEntity.getStudentFirstName(),
                studentEntity.getStudentLastName(),
                studentEntity.getStudentAge(),
                studentEntity.getActiveStatus(),
                studentEntity.getSubjects().stream()
                        .map(ObjectMapperUtility::mapToSubjectDto)
                        .toList()
        );
    }

    public static SubjectResponseDto mapToSubjectDto(SubjectEntity subjectEntity) {
        return new SubjectResponseDto(
                subjectEntity.getSubjectId(),
                subjectEntity.getSubjectName(),
                subjectEntity.getActiveStatus()
        );
    }

    public static SubjectEntity mapToSubjectEntity(SubjectRequestDto subjectRequestDto) {
        return SubjectEntity.builder()
                .subjectId(0)
                .subjectName(subjectRequestDto.getSubjectName())
                .activeStatus(subjectRequestDto.getActiveStatus())
                .createDate(LocalDateTime.now())
                .build();
    }

    public static SubjectEntity mapToSubjectEntity(Integer subjectId) {
        return SubjectEntity.builder()
                .subjectId(subjectId)
                .build();
    }

    public static SubjectEntity mapToSubjectEntity(Integer subjectId, SubjectRequestDto subjectRequestDto) {
        return SubjectEntity.builder()
                .subjectId(subjectId)
                .subjectName(subjectRequestDto.getSubjectName())
                .activeStatus(subjectRequestDto.getActiveStatus())
                .createDate(LocalDateTime.now())
                .build();
    }

    public static StudentEntity mapToStudentEntity(StudentRequestDto studentRequestDto) {
        return StudentEntity.builder()
                .studentId(0)
                .studentFirstName(studentRequestDto.getStudentFirstName())
                .studentLastName(studentRequestDto.getStudentLastName())
                .studentAge(studentRequestDto.getStudentAge())
                .activeStatus(studentRequestDto.getActiveStatus())
                .createDate(LocalDateTime.now())
                .subjects(studentRequestDto.getStudentSubjectIds().stream()
                        .map(ObjectMapperUtility::mapToSubjectEntity)
                        .toList())
                .build();
    }

    public static StudentEntity mapToStudentEntity(Integer studentId, StudentRequestDto studentRequestDto) {
        return StudentEntity.builder()
                .studentId(studentId)
                .studentFirstName(studentRequestDto.getStudentFirstName())
                .studentLastName(studentRequestDto.getStudentLastName())
                .studentAge(studentRequestDto.getStudentAge())
                .activeStatus(studentRequestDto.getActiveStatus())
                .createDate(LocalDateTime.now())
                .subjects(studentRequestDto.getStudentSubjectIds().stream()
                        .map(ObjectMapperUtility::mapToSubjectEntity)
                        .toList())
                .build();
    }
}