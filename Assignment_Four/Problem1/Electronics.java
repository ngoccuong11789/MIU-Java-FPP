package lesson5.Problem1;

public class Electronics extends Product{
    private int warranty;
    private double warrantyCost;

    public Electronics(String eProductName, double ePrice, int warranty, double warrantyCost) {
        super(eProductName, ePrice);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warrantyCost) {
        this.warranty = warrantyCost;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }

    public void setWarrantyCost(double warrantyCost) {
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        double updatedPrice;
        updatedPrice = super.getPrice() + warrantyCost;
        return updatedPrice;
    }

    @Override
    public String toString(){
        return String.format("Product Name : " + this.getProductName() + "\n"+
                        "Price : "+ this.getPrice() + "\n"+
                "warranty : "+ this.getWarranty() + "\n"
                        + "warrantyCost"+ this.warrantyCost+ "\n");
    }

}
