package com.example.test2018131382.servicelmpl;

import com.example.test2018131382.bean.UserBean;
import com.example.test2018131382.mapper.UserMapper;
import com.example.test2018131382.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServicelmpl implements UserService {

    //将DAO注入Service层
    @Resource
    private UserMapper userMapper;

    @Override
    public UserBean loginln(String name, String password) {

        return userMapper.getInfo(name, password);
    }
}