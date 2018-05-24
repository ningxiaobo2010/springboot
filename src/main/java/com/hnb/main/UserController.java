package com.hnb.main;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @Value("${name}")
//    private String name;        //从配置文件中注入值
//    @Value("${age}")
//    private Integer age;
//    @Value("${sex}")
//    private String sex;

    //@Value("${info}")
    //private String info;

    @Autowired
    private UserInfoProperties userInfoProperties;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String print(){
        return "Hello,Spring Boot.";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String printUser(){
        //return new String("姓名:" + name + "  年龄：" + age + "  性别:" + sex);
        //return info;
        return userInfoProperties.getName();
    }

}
