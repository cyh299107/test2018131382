package com.example.test2018131382;

import com.example.test2018131382.bean.UserBean;
import com.example.test2018131382.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
 class Test2018131382Applications {
    @Autowired
    UserService userService;

    @Test
    public  void contextLoads(){
        UserBean userBean = userService.loginln("a","a");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getld());
    }
    
}


