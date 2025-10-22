package com.cbrain.controller.dto;

public class SubjectRequestDto {

    private String subjectName;
    private String activeStatus;

    public SubjectRequestDto() {
    }

    public SubjectRequestDto(String subjectName, String activeStatus) {
        this.subjectName = subjectName;
        this.activeStatus = activeStatus;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }
}