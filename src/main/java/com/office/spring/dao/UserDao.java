package com.office.spring.dao;

/**
 * Created by totient on 30/7/15.
 */
import java.util.List;


import com.office.spring.model.User;

public interface UserDao {

    void saveUser(User user);

    List<User> findAllUsers();

    void deleteUserByEmail(String email);

    User findByEmail(String ssn);

    User findById(Integer id);

    void deleteUserById(Integer id);

    void updateUser(User user);

}