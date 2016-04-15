package com.office.spring.dao;

/**
 * Created by totient on 30/7/15.
 */

import java.util.List;

import com.office.spring.model.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer,User > implements UserDao{

    @Override
    public void saveUser(User user) {
        persist(user);
    }

    @SuppressWarnings("unchecked")
    public List<User> findAllUsers() {
        Criteria criteria = getSession().createCriteria(User.class);
        return (List<User>) criteria.list();
    }

    public void deleteUserById(Integer id) {
        User user =findById(id);
        delete(user);
    }

    public void deleteUserByEmail(String email) {
        Query query = getSession().createSQLQuery("delete from User where email = :email");
        query.setString("email", email);
        query.executeUpdate();
    }



    public User findByEmail(String email){
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("email",email));
        return (User) criteria.uniqueResult();
    }

    public void updateUser(User user){
        getSession().merge(user);
    }

    public User findById(Integer id){

        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("id",id));
        return (User) criteria.uniqueResult();
    }
}