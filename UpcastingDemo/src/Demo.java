
public class Demo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal{
    public void eat() {
        System.out.println("dog eating");
    }

    public void run() {
        System.out.println("dog running");
    }
}
