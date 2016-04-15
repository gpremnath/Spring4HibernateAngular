package com.office.spring.service;

/**
 * Created by totient on 30/7/15.
 */
import java.util.List;


import com.office.spring.model.User;

public interface UserService {

    void saveUser(User user);

    List<User> findAllUsers();

    void deleteUserByEmail(String email);

    User findByEmail(String email);

    void deleteUserById(Integer id);

    User findById(Integer id);

    void updateUser(User user);



}