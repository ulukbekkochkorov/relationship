package org.example.service;

import org.example.Dao.Dao;
import org.example.Dao.DaoImpl;
import org.example.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    private Dao dao = new DaoImpl();
    @Override
    public void saveUserTable(User user) {
        dao.saveUserTable(user);
    }

    @Override
    public void dropUsersTable() {
        dao.dropUsersTable();
    }

    @Override
    public List<User> getAllUser() {
        dao.getAllUser();
        return null;
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);

    }
}
