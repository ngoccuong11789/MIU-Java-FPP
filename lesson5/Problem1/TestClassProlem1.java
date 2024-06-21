package lesson5.Problem1;

import com.sun.source.tree.EnhancedForLoopTree;

public class TestClassProlem1 {
    public static void main(String[] args) {

        Product[] products = {
                new Clothing("Product1",300.20,"Uniqlo",10),
                new Electronics("Product2",335.20,5,201),
                new Furniture("Product3",100.20,"Wood",89),
                new Clothing("Product4",300.20,"H&M",3),
                new Clothing("Product5",20.20,"LV",1),
        };

        for(Product p : products){
            System.out.println(p);
        }

        System.out.println("Sum of Products : " + sumProducts(products));
    }

    public static double sumProducts(Product[] products) {
        double sum = 0.0;
        if(products != null) {
            for(Product product : products) {
                if(product !=null) {
                    sum += product.getPrice();
                }
            }
        }
        return sum;
    }


}
