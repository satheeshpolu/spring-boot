package com.example.demo.student.service;

import org.springframework.stereotype.Service;

import com.example.demo.student.model.Student;

import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student("Employee", 12));
    }
}
