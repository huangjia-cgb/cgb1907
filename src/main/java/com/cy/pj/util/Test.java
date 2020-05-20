package com.cy.pj.util;

import java.util.ArrayList;
import java.util.List;
class Student{
     public  String name;
     public  String course;
     public int score;
     public  int total;
    public Student(){};
    public Student(String name, String course, int score) {
        this.name = name;
        this.course = course;
        this.score = score;
    }
}
public class Test {
    public static void main(String[] args) {
        List <Student>list = new ArrayList<>();
        list.add(new Student("张三","语文",60));
        list.add(new Student("张三","数学",70));
        list.add(new Student("李四","语文",65));
        list.add(new Student("李四","语文",75));

        Student result = null ;
        String name =null;
        int total =0;
        for (Student stu :list){
            if (!stu.name.equals(name)){
                result = new Student();
                total=0;
            }
            total =total+stu.score;
            result.total=total;
            name=stu.name;
        }
        System.out.println(result.total);
         System.out.println(result.name);
    }
}
