package com.javatpoint.dao;

import com.javatpoint.bean.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao {
    public static int save(User u) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(u);
            session.beginTransaction().commit();
            session.close();
            return 1;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static int update(User u) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.update(u);
            session.beginTransaction().commit();
            session.close();
            return 1;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static int delete(User u) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.delete(u);
            session.beginTransaction().commit();
            session.close();
            return 1;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

//    public static searchUser(User u) {
//        try {
//            Session ss = HibernateUtil.getSessionFactory().openSession();
//            User theuser = (User) ss.get(User.class, u.getId());
//            ss.close();
//            return theuser;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }


    public static List<User> getAllRecords() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<User> list = session.createQuery("SELECT u FROM User u").list();
            session.close();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static User getRecordById(int id) {
        User u = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Query<User> query = session.createQuery("FROM User WHERE id = :id", User.class);
            query.setParameter("id", id);
            u = (User) query.getSingleResult();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return u;
    }
}