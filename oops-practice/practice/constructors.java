public class Constructors {

    int a;
    int b;

    public Constructors() {
        a = 10;
        b = 20;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    public Constructors(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    public Constructors(Constructors c) {
        this.a = c.a;
        this.b = c.b;
        System.out.println("Copy Constructor Called");
    }

    public void display() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        // Default Constructor
        Constructors c1 = new Constructors();
        c1.display();
        // Parameterized Constructor
        Constructors c2 = new Constructors(100, 200);
        c2.display();
        // Copy Constructor
        Constructors c3 = new Constructors(c2);
        c3.display();
    }
}