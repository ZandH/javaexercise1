package com.soft1841.punch4;

/**
 * 自定义学生类，实现比较器接口，按照年龄升序排序
 * 实现Comparable接口，必须强制重写其compareTo（）方法
 *
 * @author 屏儿
 * 2019/03/20
 */
public class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    public Student(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        //按年龄升序
        return this.getAge() - student.getAge();
    }
}
