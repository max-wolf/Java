package org.ptkl.inherit.constructor;

public class Demo {

    public static void main(String[] args) {
        new B("ee");
    }

}

abstract class A {

    public A() {
        System.out.println("A init");
    }

    public A(String arg) {
        System.out.println("A init:"+arg);
    }

    public void printColor() {
        System.out.println("A");
    }
}

class B extends A {

    /**
     * 子类构造器默认会调用父类无参构造器，如果父类没有无参构造器，则会报错
     * @param arg
     */
    public B(String arg) {
        super();//可以不写
        System.out.println("B init:"+arg);
    }
}