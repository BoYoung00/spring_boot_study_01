package com.in28minures.springboot.leamspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // /courses
    // Coures: id, name, aurhor
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
            new Course(1, "Learn AWS", "in28minutes"),
            new Course(2, "Learn DevOps", "in28minutes"),
            new Course(3, "Learn KK", "in28minutes")
        );
    }
}
