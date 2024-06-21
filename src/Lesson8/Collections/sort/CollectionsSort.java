package Lesson8.Collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSort {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        // Tạo một ArrayList các chuỗi
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Banana");
        list1.add("Apple");
        list1.add("Orange");

        // In ra ArrayList trước khi sắp xếp
        System.out.println("Before sorting: " + list1);

        // Sử dụng Collections.sort() để sắp xếp ArrayList
        Collections.sort(list1);

        // In ra ArrayList sau khi sắp xếp
        System.out.println("After sorting: " + list1);


        // Tạo một ArrayList các đối tượng Person
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John", 25));
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 20));

        // In ra ArrayList trước khi sắp xếp
        System.out.println("Before sorting: " + list);

        // Sử dụng Collections.sort() với Comparator để sắp xếp theo tuổi
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        // In ra ArrayList sau khi sắp xếp
        System.out.println("After sorting: " + list);
    }
}

