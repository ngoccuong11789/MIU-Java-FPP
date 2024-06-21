package InstanceofStrategy;

import java.util.Objects;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Override the equals method to compare InstanceofStrategy.Car objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Car)) {
            return false;
        }
        Car other = (Car) obj;
        return this.year == other.year && Objects.equals(this.model, other.model);
    }


    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Toyota", 2020);
        Car car3 = new Car("Honda", 2018);

        // Comparing the object with itself
        Car car4 = new Car("Mercedes", 2025);

        System.out.println(car1.equals(car2)); // true
        System.out.println(car1.equals(car3)); // false
        System.out.println(car4.equals(car4));
    }
}
