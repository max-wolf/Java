package org.ptkl.lambda.methodreference.classref;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Clark", LocalDate.of(2003, 3, 12)),
                new Person("Dephi", LocalDate.of(2004, 5, 4)),
                new Person("Alice", LocalDate.of(2001, 9, 1)),
                new Person("Bob", LocalDate.of(2003, 2, 25)),
        };

        /*anonymous inner class*/
//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person a, Person b) {
//                return Person.compareByAge(a, b);
//            }
//        });

        /*lambda*/
//        Arrays.sort(people, (a, b) -> Person.compareByAge(a, b));

        /*Method Reference*/
        /*Reference to a Static Method*/
        Arrays.sort(people, Person::compareByAge);

        for(Person person:people) {
            System.out.println(person);
        }
    }

}