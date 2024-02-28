package com.javatpoint.Service;

import com.javatpoint.bean.User;
import com.javatpoint.dao.UserDao;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class UserServiceIMP implements UserService {
    public UserServiceIMP() {
    }

    @Override
    public int save(User u) throws Exception {
        return UserDao.save(u);
    }

    @Override
    public int update(User u) throws Exception {
        return UserDao.update(u);
    }

    @Override
    public int delete(User u) throws Exception {
        return UserDao.delete(u);
    }

    @Override
    public User getRecordById(User u) throws Exception {
        return UserDao.getRecordById(u.getId());
    }

    @Override
    public List<User> getAllRecords() throws Exception {
        return UserDao.getAllRecords();
    }
}
