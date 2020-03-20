package org.ptkl.reflection;//use reflection to implement simple factory
//we don't need to change clss org.ptkl.reflection.Factory by reflection

public class FactoryDemo {
    public static void main(String[] args) {
        Product product = Factory.getInstance("org.ptkl.reflection.ProductB");
        product.getName();
    }
}

interface Product {
    public void getName();
}

class ProductA implements Product {
    public void getName() {
        System.out.println("org.ptkl.reflection.ProductA");
    }
}

class ProductB implements Product {
    public void getName() {
        System.out.println("org.ptkl.reflection.ProductB");
    }
}

class Factory {
    public static Product getInstance(String className) {
        Product product = null;
        try {
            product = (Product)Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}