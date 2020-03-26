package org.ptkl.lambda.methodreference.superref;

public class Man extends Human {
    @Override
    public void say() {
        System.out.println("I am Man");
    }

    public void method(Greetable g) {
        g.greet();
    }

    public void show() {
        method(super::say);
    }

    public void showme() {
        method(this::say);
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.show();
        man.showme();
    }
}
