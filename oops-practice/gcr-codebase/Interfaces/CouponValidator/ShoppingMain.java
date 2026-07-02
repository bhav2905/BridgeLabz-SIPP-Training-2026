package CouponValidator;

import java.util.Scanner;

public class ShoppingMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Coupons: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] coupons = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Coupon " + (i + 1) + ": ");
            coupons[i] = sc.nextLine();
        }

        CouponValidator validator = new ShoppingCart();

        System.out.println("\nCoupon Validation");

        for (String coupon : coupons) {

            if (validator.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid");
            } else {
                System.out.println(coupon + " -> Invalid");
            }
        }

        sc.close();
    }
}