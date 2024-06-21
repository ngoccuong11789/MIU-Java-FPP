public class HourlyEmployee extends Employee{


    double wage ;
    double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }



    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }



    @Override
    public double getPayment() {
        return getHours() * getWage() ;
    }




    @Override
    public String toString(){
        return super.toString() + String.format("\nDailySalary :%s ", this.getPayment() );
    }
}
