package OnlineRetailOrder;

import java.util.Scanner;

public class RetailMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order ID : ");
        int orderId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Order Date : ");
        String orderDate = sc.nextLine();
        System.out.print("Enter Tracking Number : ");
        String trackingNumber = sc.nextLine();
        System.out.print("Enter Delivery Date : ");
        String deliveryDate = sc.nextLine();

        DeliveredOrder order =
                new DeliveredOrder(
                        orderId,
                        orderDate,
                        trackingNumber,
                        deliveryDate
                );

        System.out.println("\n===== ORDER DETAILS =====");

        order.displayInfo();
    }
}