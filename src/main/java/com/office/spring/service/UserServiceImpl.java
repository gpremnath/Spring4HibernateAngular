package com.office.spring.service;

/**
 * Created by totient on 30/7/15.
 */
import java.util.List;

import com.office.spring.dao.UserDao;
import com.office.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;

    public void saveUser(User user) {
        dao.saveUser(user);
    }

    public List<User> findAllUsers() {
        return dao.findAllUsers();
    }

    public void deleteUserByEmail(String email) {
        dao.deleteUserByEmail(email);
    }

    public User findByEmail(String email) {
        return dao.findByEmail(email);
    }

    public void deleteUserById(Integer id) {
        dao.deleteUserById(id);
    }

    public User findById(Integer id) {
        return dao.findById(id);
    }

    public void updateUser(User user){

        dao.updateUser(user);
    }

}