package com.liuhy.service.impl;

import com.liuhy.dao.UserDao;
import com.liuhy.domain.User;
import com.liuhy.service.UserService;

/**
 * Created by liuhy on 2017/2/25.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }
}
