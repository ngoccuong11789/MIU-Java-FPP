package lesson5.Problem5.nonOO.ToOO;

public class AirCondition extends ClosedMachine{

    private String brand;
    public AirCondition(String brand) { this.brand = brand;}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void performFunction() {
        System.out.println("The brand of AirCondition is: " + brand + ".");
    }

}
