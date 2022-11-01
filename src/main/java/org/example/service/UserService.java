package org.example.service;

import org.example.entity.User;

import java.util.List;

public interface



UserService {
    void saveUserTable(User user);

    void dropUsersTable ();

    public List<User> getAllUser();

    void deleteById(Long id);
}
