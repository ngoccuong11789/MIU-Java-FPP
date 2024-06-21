package lesson5.Problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurity, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurity, grossSales, commissionRate);
        this.baseSalary = baseSalary;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment(){
        //BasePlusCommisionEmployee : baseSalary + (grossSales * CommisionRate)
        return baseSalary + (getGrossSales() * getCommissionRate());
    }

    @Override
    public String toString() {
        return super.toString() + "base Salary :" + baseSalary + " Payment :" + getPayment();
    }


}
