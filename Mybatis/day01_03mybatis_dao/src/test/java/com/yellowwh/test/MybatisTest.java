package com.yellowwh.test;

import com.mysql.cj.Session;
import com.mysql.cj.result.SqlDateValueFactory;
import com.yellowwh.dao.IUserDao;
import com.yellowwh.dao.impl.UserDaoImpl;
import com.yellowwh.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.rmi.server.ExportException;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws Exception {

        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        IUserDao userDao=new UserDaoImpl(factory);

        List<User> users=userDao.findAll();
        for(User user:users){
            System.out.println(user);
        }
        in.close();



    }
}
