package com.spring.course.springsecuritycourse.jwt;


import lombok.Data;

@Data
public class UsernamePasswordAuthenticationRequest {
    private String username;
    private String password;
}
