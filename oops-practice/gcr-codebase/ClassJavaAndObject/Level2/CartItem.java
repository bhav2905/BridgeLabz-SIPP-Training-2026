import java.util.Scanner;

public class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName,
                    double price,
                    int quantity) {

        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
    }

    public void removeItem(int qty) {

        if (qty <= quantity)
            quantity -= qty;
    }

    public double totalCost() {
        return price * quantity;
    }

    public void display() {

        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost : " + totalCost());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        CartItem cart =
                new CartItem(name, price, qty);

        cart.display();
    }
}