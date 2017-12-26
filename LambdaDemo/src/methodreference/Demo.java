package methodreference;

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

        /*lambda*/
        //Arrays.sort(people, (a, b) -> Person.compareByAge(a, b));

        /*Method Reference*/
        //Reference to a Static Method
        //Arrays.sort(people, Person::compareByAge);

        //Reference to an Instance Method of a Particular Object
        //ComparisonProvider cp = new ComparisonProvider();
        //Arrays.sort(people, cp::compareByAge);

        System.out.println(Arrays.asList(people));

        //Reference to an Instance Method of an Arbitrary Object of a Particular Type
        String[] stringArray = {"Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        System.out.println(Arrays.asList(stringArray));

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
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }
}

class ComparisonProvider {
    public int compareByAge(Person a, Person b) {
        return a.getBirthday().compareTo(b.getBirthday());
    }
}