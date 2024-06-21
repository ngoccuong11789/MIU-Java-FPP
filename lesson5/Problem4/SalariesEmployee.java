package lesson5.Problem4;

public class SalariesEmployee extends Employee{

    private double weeklySalary;

    public SalariesEmployee(String firstName, String lastName,
                            String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "get weekly Salary " + getWeeklySalary() + "get payment " + getPayment();
    }

}
