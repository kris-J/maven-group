package com.fangjie.maven.dao;

import com.fangjie.maven.bean.User;
import com.fangjie.maven.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2019/2/27 10:25
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(User user) {
        Session session = null;
        try {
            session = HibernateUtil.openSession();
            session.beginTransaction();

            session.save(user);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.close(session);
        }


    }

    @Override
    public List<User> getByUsername(String username) {
        Session session = null;
        List<User> user = null;
        try {
            session = HibernateUtil.openSession();
            session.beginTransaction();
            String hql = "From User where username=?";
            user = session.createQuery(hql).setParameter(0, username).list();

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.close(session);
        }
        return user;
    }
}
