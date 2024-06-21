package Lesson8.consistcomparator;

import java.util.Comparator;

public class EmployeeFirstnameCom implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFname().compareTo(o2.getFname());
    }
}
