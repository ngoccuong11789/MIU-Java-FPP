public class BasePlusCommissionEmployee extends CommisionEmployee {


    double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commisionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    @Override
    public double getPayment() {
        return getBaseSalary() + (super.grossSales * getCommisionRate()) ;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Salaryis : %s",this.getPayment());
    }
}
