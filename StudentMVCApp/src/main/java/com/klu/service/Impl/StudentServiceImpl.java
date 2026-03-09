package com.klu.service.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private List<Student> studentList = new ArrayList<>();

    @Override
    public String getWelcomeMessage() {
        return "Welcome to Student MVC CRUD Applications";
    }

    // Create
    @Override
    public Student createStudent(Student student) {
        studentList.add(student);
        return student;
    }

    // Read by ID
    @Override
    public Student getStudentById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Read all
    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    // Update
    @Override
    public Student updateStudent(int id, Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                student.setId(id);
                studentList.set(i, student);
                return student;
            }
        }
        return null;
    }

    // Delete
    @Override
    public String deleteStudent(int id) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                return "Student record deleted successfully";
            }
        }
        return "No student record found";
    }

    // 🔍 Search by Name AND Course
    @Override
    public List<Student> searchStudent(String name, String course) {
        List<Student> result = new ArrayList<>();
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)
                    && s.getCourse().equalsIgnoreCase(course)) {
                result.add(s);
            }
        }
        return result;
    }
}