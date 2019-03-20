package com.soft1841.punch4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 实现Comparable接口的Student，放入List进行按年龄排序
 *
 * @author 屏儿
 * 2019/03/20
 */
public class StudentList {
    public static void main(String[] args) {
        //创建List对象，存入Student对象
        List<Student> list = new ArrayList<>();
        list.add(new Student("森火", 18));
        list.add(new Student("风萤", 20));
        list.add(new Student("糜途", 22));
        list.add(new Student("橘城", 25));
        //调用Collections的sort方法，会自动调用之前写的compareTo方法进行排序
        Collections.sort(list);
        //用foreach循环遍历list
        for (Student student : list) {
            System.out.println("姓名：" + student.getName() + ",年龄：" + student.getAge());
        }
    }
}
