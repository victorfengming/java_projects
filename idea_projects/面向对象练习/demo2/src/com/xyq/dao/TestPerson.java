package com.xyq.dao;
// 把entity包下的person类导入到当前文件
import com.xyq.entity.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(p.pub);
        System.out.println(p.pri);
        System.out.println(p.def);

    }
}
