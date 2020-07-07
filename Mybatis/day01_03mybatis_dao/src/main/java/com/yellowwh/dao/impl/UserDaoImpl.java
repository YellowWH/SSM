package com.yellowwh.dao.impl;

import com.yellowwh.dao.IUserDao;
import com.yellowwh.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory){
        this.factory=factory;
    }

    public List<User> findAll(){
        SqlSession session = factory.openSession();
        List<User> users = session.selectList("com.yellowwh.dao.IUserDao.findAll");
        session.close();

        return users;
    }
}
