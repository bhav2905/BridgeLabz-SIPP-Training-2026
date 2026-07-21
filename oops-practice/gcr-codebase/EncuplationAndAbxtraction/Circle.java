package AreaAndPerimter;

public class Circle extends Shape {

    private int radius;
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle = " + perimeter);
    }
}