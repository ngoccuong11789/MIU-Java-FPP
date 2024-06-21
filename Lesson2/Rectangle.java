package Lesson2;

final class Rectangle {
    private final double width;
    private final double length;



    public Rectangle(double w, double l) {
        width = w;
        length =l;
    }

    public double getWidth() {
        return width;
    }
    public  double getLength() {
        return  length;
    }

    public double computeArea() {
        return width * length;
    }

}
