package com.spring.course.springsecuritycourse.restcontrollers;

import com.spring.course.springsecuritycourse.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    public static final List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(3770, "Eric Gitonga Njue"));
        students.add(new Student(1435, "Frida Kagendo Njue"));
        students.add(new Student(1992, "Eva Woki Ndungu"));
        students.add(new Student(89, "Shauleen Muthoni"));
        students.add(new Student(900, "Pauline Wambura Njue"));
    }

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {
        return students.stream()
                .filter(f -> f.getStudentId().equals(studentId))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("Student with id %d does not exist", studentId)));
    }
}
