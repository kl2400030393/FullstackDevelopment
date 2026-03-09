package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Student;
import com.klu.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // Welcome
    @GetMapping("/greet")
    public String welcomeMessage() {
        return service.getWelcomeMessage();
    }

    // Create student
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // Get all students
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // Update student
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id,
                                 @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // Delete student
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }

    // 🔍 Search by name AND course
    @GetMapping("/search")
    public List<Student> searchStudent(@RequestParam String name,
                                       @RequestParam String course) {
        return service.searchStudent(name, course);
    }
}