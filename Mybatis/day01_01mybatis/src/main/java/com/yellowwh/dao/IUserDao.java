package com.yellowwh.dao;

import com.yellowwh.domain.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();
}
