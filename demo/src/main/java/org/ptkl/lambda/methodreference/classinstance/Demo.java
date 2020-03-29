package org.ptkl.lambda.methodreference.classinstance;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Jack1", 88));
        list.add(new Student("Jack2", 83));
        list.add(new Student("Jack3", 82));
        list.add(new Student("Jack4", 85));
        list.add(new Student("Jack5", 84));
        list.add(new Student("Jack6", 81));
        Student s = new Student("Jack6", 81);

        /*lambda*/
//        list.sort((student, t1) -> student.compareByScore(t1));

        /*method reference*/
        list.sort(Student::compareByScore);

        System.out.println(list);
    }
}

class Student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareByScore(Student student) {
        return this.score - student.score;
    }
}