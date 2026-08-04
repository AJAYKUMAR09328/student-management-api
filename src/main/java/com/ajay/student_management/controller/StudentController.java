package com.ajay.student_management.controller;

import com.ajay.student_management.dto.StudentRequest;
import com.ajay.student_management.dto.StudentResponse;
import com.ajay.student_management.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Add Student
    @PostMapping
    public ResponseEntity<StudentResponse> addStudent(
            @Valid @RequestBody StudentRequest studentRequest) {

        StudentResponse response = studentService.addStudent(studentRequest);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Get All Students
    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAllStudents() {

        return ResponseEntity.ok(studentService.getAllStudents());
    }

    // Get Student By Id
    @GetMapping("/{id}")
    public ResponseEntity<StudentResponse> getStudentById(
            @PathVariable Long id) {

        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    // Update Student
    @PutMapping("/{id}")
    public ResponseEntity<StudentResponse> updateStudent(
            @PathVariable Long id,
            @Valid @RequestBody StudentRequest studentRequest) {

        return ResponseEntity.ok(
                studentService.updateStudent(id, studentRequest));
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(
            @PathVariable Long id) {

        studentService.deleteStudent(id);

        return ResponseEntity.ok("Student deleted successfully.");
    }

    // Search Student By Email
    @GetMapping("/email/{email}")
    public ResponseEntity<StudentResponse> getStudentByEmail(
            @PathVariable String email) {

        return ResponseEntity.ok(
                studentService.getStudentByEmail(email));
    }
}