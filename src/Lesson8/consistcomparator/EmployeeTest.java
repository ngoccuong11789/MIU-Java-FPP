package Lesson8.consistcomparator;

import java.time.LocalDate;
import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom","Bruce", LocalDate.of(2014,12,12));
        Employee e2 = new Employee("Renuka","Mohanraj", LocalDate.of(2014,5,1));
        Employee e3 = new Employee("Tom","Daniel", LocalDate.of(2020,11,11));
        Employee e4 = new Employee("Tom","Bruce", LocalDate.of(2016,10,10));
        Employee e5 = new Employee("Anne","Dow", LocalDate.of(2014,12,12));

        // Employee Array List
        List<Employee> elist = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));
        // Sort by FirstName -
        Collections.sort(elist, new EmployeeFirstnameCom());
        System.out.println("Sort by firstName List" + elist);
        elist.forEach(x-> System.out.println(x.getFname()));

        // How to make Comparator which consist with equals()
        Employee e11 = new Employee("Tom","Bruce", LocalDate.of(2014,12,12));

        Employee e12 = new Employee("Tom", "Lester" , LocalDate.of(2018, 10, 20));
        boolean res = e11.equals(e12); // false
        System.out.println("e11.equals(e12) = " + res);
        // Call Firstname Comparator to test e11 and e12 equality
        EmployeeFirstnameCom ob = new EmployeeFirstnameCom();
        int com = ob.compare(e11, e12);
        // EmployeeFirstCom

        // New way of using consist comparator
        Collections.sort(elist, Comparator.comparing(Employee::getFname).thenComparing(Employee::getLname).thenComparing(Employee::getHireDay));


    }
}
