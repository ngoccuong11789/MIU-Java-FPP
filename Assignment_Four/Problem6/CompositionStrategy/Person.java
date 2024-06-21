package CompositionStrategy;

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

    // Override the equals method to compare Person objects
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
        Car car1 = new Car("Toyota", 2024);
        Car car2 = new Car("Toyota", 2024);
        Car car3 = new Car("Nissan", 2020);

        Person person1 = new Person("John", 25, car1);
        Person person2 = new Person("John", 25, car2);
        Person person3 = new Person("Jane", 30, car3);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
    }
}
