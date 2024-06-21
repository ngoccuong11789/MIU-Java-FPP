public class SalariedEmployee extends Employee{

    double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double getPayment() {
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return super.toString() + String.format("\nweekly Salary :%s ", this.getPayment());
    }
}
