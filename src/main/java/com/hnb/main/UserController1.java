package com.hnb.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController1 {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    //查询所有用户信息
    @GetMapping(value="/userList")
    public List<User> userList(){
        return userRepository.findAll();
    }

    //查询一个用户
    @GetMapping(value="/user/{id}")
    public User queryUser(@PathVariable("id") Integer id){

        return userRepository.findOne(id);

    }

    //更新
    @PutMapping(value="/user/{id}")
    public User userUpdate(@PathVariable("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("sex") String sex,
                           @RequestParam("age") Integer age){

        User user = new User();
        user.setSex(sex);
        user.setAge(age);
        user.setName(name);
        user.setId(id);

        return userRepository.save(user);

    }

    //删除一个用户
    @DeleteMapping(value="/user/{id}")
    public void userDelete(@PathVariable("id") Integer id){

        userRepository.delete(id);
    }

    //新增一个用户
    @PostMapping(value="/userAdd")
    public User userAdd(@RequestParam("name") String name,
                          @RequestParam("sex") String sex,
                          @RequestParam("age") Integer age ){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);

        return userRepository.save(user);
    }

    //通过年龄查询用户
    @GetMapping(value="/user/age/{age}")
    public List<User> UserListByAge(@PathVariable(value="age") Integer age){
        return userRepository.findByAge(age);
    }

    //插入两条用户信息
    @PostMapping("/user/two")
    public void userTwo(){
        userService.insertUsers();
    }

}
