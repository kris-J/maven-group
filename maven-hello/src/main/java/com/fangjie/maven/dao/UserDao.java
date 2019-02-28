package com.fangjie.maven.dao;

import com.fangjie.maven.bean.User;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2019/2/27 10:24
 */
public interface UserDao {

    void addUser(User user);

    List<User> getByUsername(String username);
}
