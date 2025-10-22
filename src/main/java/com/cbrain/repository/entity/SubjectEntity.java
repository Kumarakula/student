package com.cbrain.repository.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "subjects")
@Builder
@Data
public class SubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subject_id")
    private Integer subjectId;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "active_status")
    private String activeStatus;

    @ManyToMany(mappedBy = "subjects")
    private List<StudentEntity> students;

    public SubjectEntity() {}

    public SubjectEntity(Integer subjectId, String subjectName, LocalDateTime createDate,
                         String activeStatus, List<StudentEntity> students) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.createDate = createDate;
        this.activeStatus = activeStatus;
        this.students = students;
    }

    // Getters and Setters
    // (You can generate these using your IDE or manually write them)
}