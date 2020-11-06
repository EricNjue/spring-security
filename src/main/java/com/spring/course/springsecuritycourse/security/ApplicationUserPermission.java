package com.spring.course.springsecuritycourse.security;

public enum ApplicationUserPermission {
    STUDENT_READ("STUDENT:READ".toLowerCase()),
    STUDENT_WRITE("STUDENT:WRITE".toLowerCase()),
    COURSE_READ("COURSE:READ".toLowerCase()),
    COURSE_WRITE("COURSE:WRITE".toLowerCase());

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }


}
