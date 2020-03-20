package org.ptkl.enumdemo.pizza;

public class App {
    public static void main(String[] args) {
        System.out.println(PizzaStatus.DELIVERED);
        System.out.println(PizzaStatus.DELIVERED.getClass());
        System.out.println(PizzaStatus.DELIVERED.name());
        System.out.println(PizzaStatus.DELIVERED.name().getClass());
    }
}
