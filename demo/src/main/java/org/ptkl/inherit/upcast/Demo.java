package org.ptkl.inherit.upcast;

class Father {
    int age = 40;

    void eat() {
        System.out.println("father eat");
    }
}

class Son extends Father {
    int age = 18;

    void eat() {
        System.out.println("son eat");
    }

    void play() {
        System.out.println("son play");
    }
}

public class Demo {
    public static void main(String[] args) {
        Father c = new Son();
        c.eat();    //子类重写了父类的方法
//        c.play(); //compile error
        System.out.println(c.age);  //属性没有重写
    }
}
