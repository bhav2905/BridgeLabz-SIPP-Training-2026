package AreaAndPerimter;

public class Triangle extends Shape {

    private int base;
    private int height;
    private int side;

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Triangle = " + (3 * side));
    }
}