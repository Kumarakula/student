package com.cbrain.controller.dto;

public class SubjectResponseDto {

    private Integer subjectId;
    private String subjectName;
    private String activeStatus;

    public SubjectResponseDto() {
    }

    public SubjectResponseDto(Integer subjectId, String subjectName, String activeStatus) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.activeStatus = activeStatus;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
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