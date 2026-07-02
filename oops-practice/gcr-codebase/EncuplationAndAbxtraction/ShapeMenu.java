package AreaAndPerimter;

import java.util.Scanner;

public class ShapeMenu extends ShapeMenuAbs {

    Shape s;
    @Override
    public void choices() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Rectangle r = new Rectangle();
                System.out.print("Enter Length : ");
                r.setLength(sc.nextInt());
                System.out.print("Enter Breadth : ");
                r.setBreadth(sc.nextInt());
                s = r;
                s.area();
                s.perimeter();
                break;

            case 2:

                Triangle t = new Triangle();
                System.out.print("Enter Base : ");
                t.setBase(sc.nextInt());
                System.out.print("Enter Height : ");
                t.setHeight(sc.nextInt());
                System.out.print("Enter Side : ");
                t.setSide(sc.nextInt());

                s = t;
                s.area();
                s.perimeter();
                break;

            case 3:

                Circle c = new Circle();
                System.out.print("Enter Radius : ");
                c.setRadius(sc.nextInt());
                s = c;
                s.area();
                s.perimeter();
                break;

            default:

                System.out.println("Invalid Choice");
        }
    }
}