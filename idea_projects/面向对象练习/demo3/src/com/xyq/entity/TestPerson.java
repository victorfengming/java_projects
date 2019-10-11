package com.xyq.entity;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("周润发");
        p.setColor("红");
        p.setAge(-1); //语法没有问题,但是,逻辑上有重大问题

        // System.out.println(p.name);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getColor());
        p.chi();
    }
}
