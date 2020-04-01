package org.ptkl.inherit;

class A{
    int a = 8;
    int b = 10;
}

class B extends A{
    int a = 3;
}

class C extends B{
    int a = 7;

    void f() {
        /*访问父类同名属性*/
        System.out.println(super.a);
        /*
        * Java不支持super.super
        * 使用向上转型获得同名属性
        * */
        System.out.println(((A)this).a);
    }
}

public class Demo {
    public static void main(String[] args) {
        new C().f();
    }
}