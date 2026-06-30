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
    @Column(name = "id") // Khóa chính là id theo SQL trong ảnh
    private Long id;

    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "status")
    @Enumerated(EnumType.STRING) // Tự động mapping với tập check ('ACTIVE','INACTIVE',...) của cột varchar
    private CourseStatus status;

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false) // Khóa ngoại liên kết, không được phép null giống như SQL
    private Instructor instructor;
}