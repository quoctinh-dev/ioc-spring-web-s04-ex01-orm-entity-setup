package com.rikkei.coursemanagementsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "instructors")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Trong ảnh primary key đặt tên là id (không phải instructor_id)
    private Long id;

    @Column(name = "name", length = 100, nullable = false) // length = 100 theo đúng varchar(100) trong ảnh
    private String name;

    @Column(name = "email", length = 255) // Không thấy check unique trong log SQL nên để bình thường
    private String email;
}