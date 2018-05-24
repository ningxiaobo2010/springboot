package com.hnb.main;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//泛型的第一个类型是实体类名，第二个类型是实体类对应的表的主键ID
public interface UserRepository extends JpaRepository<User, Integer> {

    //通过年龄查询,方法名必须符合格式
    public List<User> findByAge(Integer age);

}
