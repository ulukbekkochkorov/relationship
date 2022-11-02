package org.example.service;

import org.example.Dao.StudentDao;
import org.example.Dao.StudentDaoImpl;
import org.example.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao dao = new StudentDaoImpl();
    @Override
    public void saveStudentTable(Student student) {
        dao.saveStudentTable(student);
    }

    @Override
    public void dropStudentsTable() {
        dao.dropStudentTable();
    }

    @Override
    public List<Student> getAllStudent() {
        dao.getAllStudent();
        return null;
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);

    }
}
