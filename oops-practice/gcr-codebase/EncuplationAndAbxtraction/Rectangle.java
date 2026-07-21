package AreaAndPerimter;

public class Rectangle extends Shape {

    private int length;
    private int breadth;
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (length + breadth)));
    }
}