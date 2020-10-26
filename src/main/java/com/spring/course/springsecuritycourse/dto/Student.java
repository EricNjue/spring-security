package com.spring.course.springsecuritycourse.dto;

import lombok.Data;

@Data
public class Student {
    private Integer studentId;
    private String studentName;

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
