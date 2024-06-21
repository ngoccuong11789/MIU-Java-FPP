import java.lang.reflect.Array;

public class Driver {
    public static void main(String[] args) {


        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("Magdy", "Youakim", "2384774", 9498);
        employees[1] = new HourlyEmployee("Mark", "Youakim", "7893293", 100, 12);
        employees[2] = new CommisionEmployee("Neven", "Edwar", "72343290", 872, 32);
        employees[3] = new BasePlusCommissionEmployee("Sai", "San", "2340234", 1234, 12312);
        employees[4] = new SalariedEmployee("Cuong", "Negydas", "23423432", 8349);


        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Employee maxSalaryEmployee = findMaxSalary(employees);
        if (maxSalaryEmployee != null) {
            System.out.println("\nEmployee with maximum salary:");
            System.out.println(maxSalaryEmployee);
        }
    }

     public static Employee findMaxSalary(Employee[] employees){
         if(employees == null || employees.length == 0 )
             return null;
         Employee maxSalaryEmployee = employees[0];
         for(Employee employee : employees){
             if(employee != null && employee.getPayment() > maxSalaryEmployee.getPayment()){
                 maxSalaryEmployee = employee;
             }
         }
            return maxSalaryEmployee;

        }

    }
