package com.cbrain.controller;

import com.cbrain.controller.dto.SubjectRequestDto;
import com.cbrain.controller.dto.SubjectResponseDto;
import com.cbrain.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/subject")
public class SubjectController {

    private final SubjectService subjectService;

    @PostMapping
    public SubjectResponseDto createSubject(@RequestBody SubjectRequestDto subjectRequestDto) {
        return subjectService.createSubject(subjectRequestDto);
    }

    @GetMapping("/{subjectId}")
    public SubjectResponseDto getSubject(@PathVariable Integer subjectId) {
        return subjectService.getSubject(subjectId);
    }

    @GetMapping("/all")
    public List<SubjectResponseDto> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/byStatus")
    public List<SubjectResponseDto> getAllSubjectsByActiveStatus(@RequestParam String activeStatus) {
        return subjectService.getAllSubjectsByActiveStatus(activeStatus);
    }

    @PutMapping("/{subjectId}")
    public SubjectResponseDto updateSubject(@PathVariable Integer subjectId, @RequestBody SubjectRequestDto subjectRequestDto) {
        return subjectService.updateSubject(subjectId, subjectRequestDto);
    }

    @DeleteMapping("/{subjectId}")
    public void deleteSubject(@PathVariable Integer subjectId) {
        subjectService.deleteSubject(subjectId);
    }
}