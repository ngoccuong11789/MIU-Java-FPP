package lesson5.Problem1;
//Clothing class has additional fields brand and discount percentage.
public class Clothing extends Product {
    private String brand;
    private double  discountPercentage;
    public Clothing(String productName, double price, String brand, double discountPercentage) {
        super(productName, price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        double basePrice = super.getPrice();
        return basePrice * (1 - discountPercentage/100);
    }

    @Override
    public String toString(){
        return String.format("Product Name : " + this.getProductName() + "\n"+
                        "Price : "+ this.getPrice() + "\n"+
                "brand : "+ this.getBrand() + "\n"
                        + "discountPercentage"+ this.discountPercentage + "\n");
    }

}
