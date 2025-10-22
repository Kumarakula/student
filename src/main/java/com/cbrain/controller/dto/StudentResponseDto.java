package com.cbrain.controller.dto;

import java.util.List;

public class StudentResponseDto {

    private Integer studentId;
    private String studentFirstName;
    private String studentLastName;
    private Integer studentAge;
    private String activeStatus;
    private List<SubjectResponseDto> studentSubjects;

    public StudentResponseDto() {
    }

    public StudentResponseDto(Integer studentId, String studentFirstName, String studentLastName,
                              Integer studentAge, String activeStatus,
                              List<SubjectResponseDto> studentSubjects) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAge = studentAge;
        this.activeStatus = activeStatus;
        this.studentSubjects = studentSubjects;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public List<SubjectResponseDto> getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentSubjects(List<SubjectResponseDto> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }
}