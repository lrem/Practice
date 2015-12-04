package com.apache.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by zhongjing on 2015/11/2 0002.
 */
public class User implements Serializable {
    @Setter
    @Getter
    private String grade;
    @Setter
    @Getter
    private int age;
    @Setter
    @Getter
    private BigDecimal money;

    public User() {
    }

    public User(String grade,int age,BigDecimal money) {
        this.grade = grade;
        this.age = age;
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "grade='" + grade + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
