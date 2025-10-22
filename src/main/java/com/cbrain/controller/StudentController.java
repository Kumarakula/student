package com.cbrain.controller;

import com.cbrain.controller.dto.StudentRequestDto;
import com.cbrain.controller.dto.StudentResponseDto;
import com.cbrain.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public StudentResponseDto createStudent(@RequestBody StudentRequestDto studentRequestDto) {
        return studentService.createStudent(studentRequestDto);
    }

    @GetMapping("/{studentId}")
    public StudentResponseDto getStudent(@PathVariable Integer studentId) {
        return studentService.getStudent(studentId);
    }

    @GetMapping("/all")
    public List<StudentResponseDto> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/byStatus")
    public List<StudentResponseDto> getAllStudentsByActiveStatus(@RequestParam String activeStatus) {
        return studentService.getAllStudentsByActiveStatus(activeStatus);
    }

    @PutMapping("/{studentId}")
    public StudentResponseDto updateStudent(@PathVariable Integer studentId, @RequestBody StudentRequestDto studentRequestDto) {
        return studentService.updateStudent(studentId, studentRequestDto);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable Integer studentId) {
        studentService.deleteStudent(studentId);
    }
}