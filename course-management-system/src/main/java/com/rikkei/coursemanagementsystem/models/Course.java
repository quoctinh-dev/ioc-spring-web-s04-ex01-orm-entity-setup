package com.rikkei.coursemanagementsystem.models;

import com.rikkei.coursemanagementsystem.enums.CourseStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
    private Long id;

    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "status")
    @Enumerated(EnumType.STRING) 
    private CourseStatus status;

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false) 
    private Instructor instructor;
}
