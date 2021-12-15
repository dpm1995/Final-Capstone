package com.techelevator.dao;

import com.techelevator.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    User getUserById(Long userId);

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String email, String password, String role);

    void makeValidated(Long userId);

    boolean isValidated(Long userId);

    String getValidation(Long userId);

    void setValidation(Long userId, String validation);
}
