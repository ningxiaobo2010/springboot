package com.hnb.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity                         //这个注解表示对应到数据库中的一个表
public class User {

    @Id                         //可以让自动生成表的时候，把ID设为主键
    @GeneratedValue             //可以让主键ID自增
    private int id;

    private String name;

    private String sex;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
