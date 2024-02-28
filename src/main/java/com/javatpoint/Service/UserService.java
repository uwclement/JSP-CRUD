package com.javatpoint.Service;

import com.javatpoint.bean.User;

import java.util.List;

public interface UserService {
    int save(User u) throws Exception;
    int update(User u) throws Exception;
    int delete(User u) throws Exception;
    User getRecordById(User u) throws Exception;
    List<User> getAllRecords() throws Exception;
}
