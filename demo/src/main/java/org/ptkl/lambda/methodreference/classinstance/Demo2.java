package org.ptkl.lambda.methodreference.classinstance;

public class Demo2 {
    public void f(String a, Integer b) {
    }

    public static void main(String[] args) {
        /*lambda*/
//        MyInter m = (d, a, b) -> d.f(a, b);
        /*method reference*/
        MyInter m = Demo2::f;
    }
}


interface MyInter {
    public void a(Demo2 d, String a, Integer b);
}