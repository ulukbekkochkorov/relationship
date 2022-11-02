package org.example.Dao;

import org.example.config.Config;
import org.example.entity.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private final SessionFactory sessionFactory = Config.createSessionFactory();
    @Override
    public void saveStudentTable(Student student) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(student);
            System.out.println("Student saved successfully");
            session.getTransaction().commit();
            session.close();
        }catch (HibernateException e) {
            e.getMessage();
        }
    }
    @Override
    public void dropStudentTable() {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.createNativeQuery("drop table if exists students;").executeUpdate();
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.getMessage();
        }
    }

    @Override
    public List<Student> getAllStudent() {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            List<Student> students = session.createQuery("select u from Student u", Student.class).getResultList();
            System.out.println(students);
            session.getTransaction().commit();
            session.close();
            return students;
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }return null;
    }

    @Override
    public void deleteById(Long id) {
        try {Session session = sessionFactory.openSession();
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.remove(student);
            session.getTransaction().commit();
            session.close();
    } catch (HibernateException e) {
            e.getMessage();
        }

    }
}
