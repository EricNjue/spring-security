package com.spring.course.springsecuritycourse.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.spring.course.springsecuritycourse.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {

    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
