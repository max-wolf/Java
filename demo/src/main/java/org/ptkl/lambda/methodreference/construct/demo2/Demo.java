package org.ptkl.lambda.methodreference.construct.demo2;

import org.ptkl.lambda.methodreference.classref.Person;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Set<Person> sp = new HashSet<Person>(){
            {
                add(new Person("Clark", LocalDate.of(2003, 3, 12)));
                add(new Person("Dephi", LocalDate.of(2004, 5, 4)));
                add(new Person("Alice", LocalDate.of(2001, 9, 1)));
                add(new Person("Bob", LocalDate.of(2003, 2, 25)));
                add(new Person("John", LocalDate.of(2003, 2, 25)));
            }
        };

        Set<Person> set = transferElements(sp, HashSet<Person>::new);
        System.out.println(set);
    }


    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
            SOURCE sourceCollection, Supplier<DEST> collectionFactory) {
        DEST result = collectionFactory.get();
        result.addAll(sourceCollection);
        return result;
    }
}
