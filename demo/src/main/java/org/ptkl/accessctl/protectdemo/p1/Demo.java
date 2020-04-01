package org.ptkl.accessctl.protectdemo.p1;

public class Demo {
    public static void main(String[] args) {
        Father father = new Father();
        father.i = 0;
        System.out.println(father.i);
        father.prt();
    }
}
