package SameClassStrategy;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Car car;

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name) && Objects.equals(car, other.car);
    }



    public static void main(String[] args) {
        Person person1 = new Person("John", 25, new Car("Toyota", 2024));
        Person person2 = new Person("John", 25, new Car("Toyota", 2024));
        Person person3 = new Person("Jane", 30, new Car("Nissan", 2020));

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
    }


}
