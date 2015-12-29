package com.apache.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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



    public static void main(String[] args){
        User user = new User();
        user.setGrade("0");
        user.setAge(0);
        user.setMoney(new BigDecimal(0));

        User user1 = new User();
        user1.setGrade("1");
        user1.setAge(1);
        user1.setMoney(new BigDecimal(1));

        User user2 = new User();
        user2.setGrade("2");
        user2.setAge(2);
        user2.setMoney(new BigDecimal(2));

        User user3 = new User();
        user3.setGrade("3");
        user3.setAge(3);
        user3.setMoney(new BigDecimal(3));

        User user4 = new User();
        user4.setGrade("4");
        user4.setAge(4);
        user4.setMoney(new BigDecimal(4));

        User user5 = new User();
        user5.setGrade("5");
        user5.setAge(5);
        user5.setMoney(new BigDecimal(5));

        List<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();


        for (int i = 0; i < users.size(); i++) {
            List<Integer> users1 = new ArrayList<Integer>();
            if (map.containsKey(1)) {
                List<Integer> a = map.get(1);
                a.add(users.get(i).getAge());
            } else {
                users1.add(users.get(i).getAge());
                map.put(i, users1);
            }
        }

        System.out.println(map.get(1).toString());
    }
}
