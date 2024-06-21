package lesson5;

import java.time.LocalDate;

public class learning {
    public static void main(String[] args) {
        Manager boss = new Manager("Boss Guy", 80000, 1987, 12, 15);
//        boss.setBonus(5000);
//        Employee[] staff = new Employee[3];
//        staff[0] = boss;
//        staff[1] = new Employee("Jimbo", 50000, 1989, 10, 1);
//        staff[2] = new Employee("Tommy", 40000, 1990, 3,15);
//
////print names and salaries
//        for(Employee e : staff) {
//            System.out.println( "name: " + e.getName() +
//                    "salary: " + e.getSalary()
//                );
//        }

        Employee e = new Manager("Boss Guy", 80000, 1987, 12, 15);
        //Manager m = new Employee

        //
    }
}


class Employee {
    Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(aYear,aMonth,aDay);
    }
    // instance methods
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    //instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;
}

class Manager extends Employee {
    public Manager(String name, double salary, int year,
                   int month, int day) {
        super(name,salary,year,month,day);
        bonus = 0;
    }
    @Override
    public double getSalary() { //no direct access to private variables of
//superclass
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double b) {
        bonus = b;
    }
    public double getBonus() { return bonus;
    }
    private double bonus;
}