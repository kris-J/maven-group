package com.fangjie.maven.dao;

import com.fangjie.maven.bean.User;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2019/2/27 10:54
 */
public class UserDaoTest {

    private UserDao userDao;

    @Before
    public void before() {
        userDao = new UserDaoImpl();
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setUsername("fj");
        userDao.addUser(user);
    }

    @Test
    public void getUserByName(){
        List<User> userList = userDao.getByUsername("fj");
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
