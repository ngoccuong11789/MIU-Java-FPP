package lesson5.Problem4;

public class driverTest {
    public static void main(String[] args) {

        Employee[] employees = {
                new BasePlusCommissionEmployee("Ngoc Cuong", "Nguyen",
                "123456", 20.5, 20, 400),
                new CommissionEmployee("John", "Doe", "111-11-1111", 5000, 10),
                new HourlyEmployee("Bob", "Brown", "333-33-3333", 15, 40),
                new SalariesEmployee("Alice", "White", "444-44-4444", 800),
                new SalariesEmployee("Charlie", "Black", "555-55-5555", 950)
        };

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println();
        }

        Employee employeeWithMaxSalary = findMaxSalary(employees);
        if(employeeWithMaxSalary != null) {
            System.out.println("Employee with max salaray : " + findMaxSalary(employees));
        } else {
            System.out.println("No employee found");
        }

    }

    public static Employee findMaxSalary(Employee[] employees) {
        if(employees == null || employees.length == 0) {
            return null;
        }

        Employee eMaxSalary = employees[0];
        for(Employee employee : employees) {
            if(employee != null && employee.getPayment() > eMaxSalary.getPayment()) {
                eMaxSalary = employee;
            }
        }
        return eMaxSalary;


    }


}
