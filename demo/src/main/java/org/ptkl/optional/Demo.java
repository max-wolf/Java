package org.ptkl.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {
        User user = new User("", 32, "Shanghai");
        User user2 = null;

//        Optional.ofNullable(user).ifPresent(System.out::println);
//        Optional.ofNullable(user2).ifPresent(System.out::println);

        Optional<User> opUser = Optional.ofNullable(user).filter(x -> !"".equals(x.name));
        opUser.ifPresent(System.out::println);

        Optional<String> opAddress = Optional.ofNullable(user).map(x -> x.address);
        opAddress.ifPresent(System.out::println);
    }
}

class User {
    String name;
    int age;
    String address;

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}