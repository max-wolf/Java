//use reflection to implement simple factory
//we don't need to change clss Factory by reflection

public class FactoryDemo {
    public static void main(String[] args) {
        Product product = Factory.getInstance("ProductB");
        product.getName();
    }
}

interface Product {
    public void getName();
}

class ProductA implements Product {
    public void getName() {
        System.out.println("ProductA");
    }
}

class ProductB implements Product {
    public void getName() {
        System.out.println("ProductB");
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