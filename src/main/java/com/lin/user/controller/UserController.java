package com.lin.user.controller;


import com.lin.user.entity.User;
import com.lin.user.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserMapper userMapper;
    /**
     * 这个注解用于：映射请求的资源路径(/hello)和当前方法(hello)的对应关系
     * 当浏览器请求 /hello 路径时, 将会访问(执行)当前这个方法
     */
    @RequestMapping(value = "/hello" ,method= RequestMethod.GET)
    public ModelAndView hello(Model model) {
        System.out.println("hello springmvc...");
        List<User> users = userMapper.findUserList();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("home");
        return modelAndView;
    }
}











