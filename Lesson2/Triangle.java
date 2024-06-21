package Lesson2;

final class Triangle {

    private final double base;
    private final double height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double getBase() {
        return  base;
    }

    public double getHeight() {
        return  height;
    }

    public double computeArea() {
        System.out.println("base : " + base + "height : " + height);

        //return 4.666;
        return (base * height)/2;
    }
}
