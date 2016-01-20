package com.apache.example.string;

import java.util.Random;

/**
 * Created by zhongjing on 2015/11/12 0012.
 */
public class StringExample {
    public static void main(String[] args){
        String str="abc";//开辟了快内存，指向"abc"
        String str1=new String("abc");//用了new就是又新开辟了内存指向另外一个"abc"，
        System.out.println(str==str1);//这个时候如果str1.equals(str2)是true，因为它们指向的内容值是相等的，但是如果是str1 == str2 就是false，因为它们指向不同。
    }
}
