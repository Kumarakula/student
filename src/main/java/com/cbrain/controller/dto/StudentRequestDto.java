package com.cbrain.controller.dto;

import java.util.List;

public class StudentRequestDto {

    private String studentFirstName;
    private String studentLastName;
    private Integer studentAge;
    private String activeStatus;
    private List<Integer> studentSubjectIds;

    public StudentRequestDto() {
    }

    public StudentRequestDto(String studentFirstName, String studentLastName,
                             Integer studentAge, String activeStatus,
                             List<Integer> studentSubjectIds) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAge = studentAge;
        this.activeStatus = activeStatus;
        this.studentSubjectIds = studentSubjectIds;
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

    public List<Integer> getStudentSubjectIds() {
        return studentSubjectIds;
    }

    public void setStudentSubjectIds(List<Integer> studentSubjectIds) {
        this.studentSubjectIds = studentSubjectIds;
    }
}