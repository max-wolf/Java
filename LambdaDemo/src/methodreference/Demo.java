package methodreference;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Person("Clark", LocalDate.of(2003, 3, 12)),
                new Person("Dephi", LocalDate.of(2004, 5, 4)),
                new Person("Alice", LocalDate.of(2001, 9, 1)),
                new Person("Bob", LocalDate.of(2003, 2, 25)),
        };

        //lambda
        //Arrays.sort(people, (a, b) -> Person.compareByAge(a, b));

        //Method Reference
        //Reference to a Static Method
        //Arrays.sort(people, Person::compareByAge);

        //Reference to an Instance Method of a Particular Object
        //ComparisonProvider cp = new ComparisonProvider();
        //Arrays.sort(people, cp::compareByAge);

        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
        //Arrays.sort(stringArray, String::compareToIgnoreCase);
        Arrays.sort(stringArray, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println(Arrays.asList(stringArray));

        System.out.println(Arrays.asList(people));
    }
}

class ComparisonProvider {
    public int compareByAge(Person a, Person b) {
        return a.getBirthday().compareTo(b.getBirthday());
    }
}