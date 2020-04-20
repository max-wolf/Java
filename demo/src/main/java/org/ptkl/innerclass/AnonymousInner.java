package org.ptkl.innerclass;

import java.util.ArrayList;
import java.util.List;

public class AnonymousInner {

    public static void main(String[] args) {
        //普通实体类的匿名内部类相当于创建了子类对象并向上转型
        Person p = new Person(){
            {
                System.out.println("ooo");
                fun();
            }

            public void getName() {
                System.out.println("ddd");
            }

            public void fun(){
                System.out.println("ppp");
            }
        };
        p.getName();
        //p.fun();  //编译不通过，因为是上转型对象
    }
}

class Person{
    String name;

    public Person(){
        System.out.println("constructor");
    }

    void getName(){
        System.out.println("Person");
    }
}