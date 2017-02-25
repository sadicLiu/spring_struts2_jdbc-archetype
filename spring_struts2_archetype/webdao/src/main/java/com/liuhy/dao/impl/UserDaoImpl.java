package com.liuhy.dao.impl;

import com.liuhy.dao.UserDao;
import com.liuhy.domain.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by liuhy on 2017/2/25.
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

    @Override
    public void save(User user) {
        this.getJdbcTemplate()
                .update("INSERT INTO t_user (username, password) VALUES (?, ?);", user.getUsername(), user.getPassword());
    }
}