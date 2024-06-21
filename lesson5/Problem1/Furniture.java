package lesson5.Problem1;

public class Furniture extends Product{
    private String material;
    private double shippingCost;
    public Furniture(String productName, double price, String material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        double updatedPrice;
        updatedPrice = super.getPrice() + shippingCost;
        return updatedPrice;
    }

    @Override
    public String toString(){
        return String.format(STR."""
                Product Name : \{this.getProductName()}
                Price : \{this.getPrice()}
                material : \{this.getMaterial()}
                shippingCost\{this.shippingCost}""" + "\n");
    }

}
