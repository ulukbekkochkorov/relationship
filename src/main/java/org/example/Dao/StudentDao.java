package org.example.Dao;

import org.example.entity.Student;

import java.util.List;

public interface StudentDao {
    void saveStudentTable(Student student);

    void dropStudentTable();

    List<Student> getAllStudent();

    void deleteById(Long id);


}
