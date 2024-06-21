public class CommisionEmployee extends Employee {


    double grossSales ;
    double commisionRate;

    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber,
                             double grossSales, double commisionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }



    public double getGrossSales() {
        return grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }



    @Override
    public double getPayment() {
        return getCommisionRate() * getGrossSales() ;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Commission Salary: %s\n",this.getPayment());
    }

}
