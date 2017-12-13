
import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}

class PersonCom implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.age - b.age;
    }
}

public class CompareTest {
    public static void main(String[] args) {
        Person a = new Person("bob", 4);
        Person b = new Person("alice", 3);
        ArrayList<Person> al = new ArrayList<>();
        al.add(a);
        al.add(b);
        al.add(new Person("c", 1));
        PersonCom comp = new PersonCom();
        Collections.sort(al, comp);
        for(Person p : al) {
            System.out.println(p.name + " " + p.age);
        }
    }

}
