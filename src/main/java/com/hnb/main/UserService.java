package com.hnb.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //插入两条用户信息
    @Transactional                  //给方法添加事务，防止数据的部分执行导致的事务问题
    public void insertUsers(){
        User user = new User();
        user.setName("jim");
        user.setAge(30);
        user.setSex("male");
        userRepository.save(user);
        User user1 = new User();
        user1.setName("bruce");
        user1.setAge(30);
        user1.setSex("女女女女男男男男男");
        userRepository.save(user1);
    }

}
