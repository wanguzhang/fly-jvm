package com.fly.jvm.init;

/**
 * @author 张攀钦
 * @date 2019-12-23-12:32
 * @description
 */
public class Student extends People {
    public static final String Student_STATIC_FINAL = "People 静态 final 常量";

    public static String Student_STATIC = "People 静态非常量";

    public Student() {
        System.out.println("Student 构造方法");
    }

    static {
        System.out.println("Student 静态代码块");
    }

    {
        System.out.println("Student 代码块");
    }
}
