package com.cbrain.repository.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "students")
@Builder
@Data
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "student_first_name")
    private String studentFirstName;

    @Column(name = "student_last_name")
    private String studentLastName;

    @Column(name = "student_age")
    private Integer studentAge;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "active_status")
    private String activeStatus;

    @ManyToMany
    @JoinTable(
            name = "student_subject",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<SubjectEntity> subjects;

    public StudentEntity() {}

    public StudentEntity(Integer studentId, String studentFirstName, String studentLastName,
                         Integer studentAge, LocalDateTime createDate, String activeStatus,
                         List<SubjectEntity> subjects) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAge = studentAge;
        this.createDate = createDate;
        this.activeStatus = activeStatus;
        this.subjects = subjects;
    }

    // Getters and Setters
    // (You can generate these using your IDE or manually write them)
}