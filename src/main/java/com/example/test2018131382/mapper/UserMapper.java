package com.example.test2018131382.mapper;

import com.example.test2018131382.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserBean getInfo(String name, String password);
}
