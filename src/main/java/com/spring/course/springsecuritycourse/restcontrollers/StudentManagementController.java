package com.spring.course.springsecuritycourse.restcontrollers;

import com.spring.course.springsecuritycourse.dto.Student;
import com.spring.course.springsecuritycourse.services.ManagementApi;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentManagementController implements ManagementApi {

    public static final List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(3770, "Eric Gitonga Njue"));
        students.add(new Student(1435, "Frida Kagendo Njue"));
        students.add(new Student(1992, "Eva Woki Ndungu"));
        students.add(new Student(89, "Shauleen Muthoni"));
        students.add(new Student(900, "Pauline Wambura Njue"));
    }

    // hasRole('ROLE_'), hasAnyRole('ROLE_'), hasAuthority('permission'), hasAnyAuthority('permission')

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_ADMINTRAINEE')")
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping
    @PreAuthorize("hasAnyAuthority('student:write')")
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}")
    @PreAuthorize("hasAnyAuthority('student:write')")
    public void deleteStudent(@PathVariable String studentId) {
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    @PreAuthorize("hasAnyAuthority('student:write')")
    public void updateStudent(@PathVariable Integer studentId, @RequestBody Student student) {
        System.out.println(studentId);
    }
}
