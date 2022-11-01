package org.example.Dao;

import org.example.config.Config;
import org.example.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DaoImpl implements Dao {
    private final SessionFactory sessionFactory = Config.createSessionFactory();
    @Override
    public void saveUserTable(User user) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(user);
            System.out.println("User saved successfully");
            session.getTransaction().commit();
            session.close();
        }catch (HibernateException e) {
            e.getMessage();
        }
    }
    @Override
    public void dropUsersTable() {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.createNativeQuery("drop table if exists users;").executeUpdate();
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.getMessage();
        }
    }

    @Override
    public List<User> getAllUser() {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            List<User> users = session.createQuery("select u from User u", User.class).getResultList();
            System.out.println(users);
            session.getTransaction().commit();
            session.close();
            return users;
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }return null;
    }

    @Override
    public void deleteById(Long id) {
        try {Session session = sessionFactory.openSession();
            session.beginTransaction();
            User user = session.get(User.class, id);
            session.remove(user);
            session.getTransaction().commit();
            session.close();
    } catch (HibernateException e) {
            e.getMessage();
        }

    }
}
