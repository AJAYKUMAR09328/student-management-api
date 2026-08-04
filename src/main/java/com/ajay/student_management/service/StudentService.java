package com.ajay.student_management.service;

import com.ajay.student_management.dto.StudentRequest;
import com.ajay.student_management.dto.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse addStudent(StudentRequest studentRequest);

    List<StudentResponse> getAllStudents();

    StudentResponse getStudentById(Long id);

    StudentResponse updateStudent(Long id, StudentRequest studentRequest);

    void deleteStudent(Long id);

    StudentResponse getStudentByEmail(String email);
}