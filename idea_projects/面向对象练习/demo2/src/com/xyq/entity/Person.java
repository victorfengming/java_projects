package com.xyq.entity;
// 包的声明, 表示当前类是从属于entity这个包下的

public class Person {

    public String pub = "public";
    private String pri = "privateee";

    String def = "defaultt";

    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(p.pub);
        System.out.println(p.pri);
        System.out.println(p.def);

    }


}
