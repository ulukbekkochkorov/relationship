package org.example.Dao;

import org.example.entity.User;

import java.util.List;

public interface Dao {
    void saveUserTable(User user);

    void dropUsersTable();

    List<User> getAllUser();

    void deleteById(Long id);


}
