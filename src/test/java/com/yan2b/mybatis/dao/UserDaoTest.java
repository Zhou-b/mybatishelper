package com.yan2b.mybatis.dao;

import com.yan2b.mybatis.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @program: mybatis-helper-demo01
 * @description: xxx
 * @author: ZhouBing
 * @create: 2021-11-03 16:28
 **/
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao mapper;

    @Test
    public void testSelectByPrimaryKey() {
        User user = mapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
    @Test
    public void testFindAll( ) {
        List<User> userList = mapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
