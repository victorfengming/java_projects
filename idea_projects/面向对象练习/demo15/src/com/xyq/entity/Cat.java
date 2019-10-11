package com.xyq.entity;

public class Cat {// 默认继承Object

//    成员属性
    String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }


    // 子类对父类提供的方法不满意


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cat c = new Cat("小花", "绿色");

        // 直接就打印c
        System.out.println(c);

        // 打印对象会默认执行打印tostring方法的结果
        System.out.println(c.toString());
        // 默认的toString() -> 包名+类@内存地址

    }

}
