package com.lin.user.test;


import com.lin.user.entity.User;
import com.lin.user.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Teste {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testFindUserList(){
        List<User> userList = userMapper.findUserList();
        for (User user:userList){
            System.out.println(user.getUsername());
        }

    }

}



