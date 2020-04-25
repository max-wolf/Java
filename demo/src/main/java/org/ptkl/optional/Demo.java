package org.ptkl.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {
        User user = new User("Bob", 32, "Shanghai");
        User user1 = null;

        //get: 返回user对象，注意user为空时会抛异常，建议使用ifPresent
//        User user2 = Optional.ofNullable(user1).get();
//        System.out.println(user2);

        //ifPresent: user不为空时执行方法
//        Optional.ofNullable(user).ifPresent(System.out::println);
//        Optional.ofNullable(user1).ifPresent(System.out::println);

        //filter: 满足filter条件时返回原值，否则返回空
//        Optional<User> opUser = Optional.ofNullable(user).filter(x -> !"".equals(x.name));
//        opUser.ifPresent(System.out::println);

        //map: 转值，map中获取的返回值包装为Optional
//        Optional<String> opAddress = Optional.ofNullable(user).map(x -> x.address);
//        opAddress.ifPresent(System.out::println);

        //flatmap: 转值，返回值需自己包装为Optional
//        Optional<String> opAddress1 = Optional.ofNullable(user1).flatMap(x -> Optional.ofNullable(x.address));
//        opAddress1.ifPresent(System.out::println);

        //orElse: 当user不为空时，返回自身；当user为空时，返回参数值
//        User user2 = Optional.ofNullable(user1).orElse(new User("Alice", 17, "Beijing"));
//        System.out.println(user2);
        //orElseGet: 当user不为空时，返回自身；当user为空时，返回Supplier结果
//        User user2 = Optional.ofNullable(user1).orElseGet(() -> new User("Alice", 17, "Beijing"));
//        System.out.println(user2);
        //or: 返回Optional对象
//        Optional<User> opUser1 = Optional.ofNullable(user).or(() -> Optional.of(new User("Alice", 17, "Beijing")));
//        Optional.ofNullable(opUser1.get()).ifPresent(System.out::println);

        /*
        orElse和orElseGet的区别：当orElse参数为函数时，无论user是否为空都执行函数，OrElseGet只有在user为空时才执行Supplier方法
         */
//        Optional.ofNullable(user).orElse(createUser());    //执行createUser
//        Optional.ofNullable(user1).orElse(createUser());    //执行createUser
//        Optional.ofNullable(user).orElseGet(Demo::createUser);  //不执行createUser
//        Optional.ofNullable(user1).orElseGet(Demo::createUser);  //执行createUser


    }

    private static User createUser(){
        System.out.println("creating");
        return new User("Kate", 29, "Shenzhen");
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