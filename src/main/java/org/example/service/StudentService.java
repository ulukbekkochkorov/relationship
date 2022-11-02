package org.example.service;

import org.example.entity.Student;

import java.util.List;

public interface


StudentService {
    void saveStudentTable(Student student);

    void dropStudentsTable ();

    public List<Student> getAllStudent();

    void deleteById(Long id);
}
