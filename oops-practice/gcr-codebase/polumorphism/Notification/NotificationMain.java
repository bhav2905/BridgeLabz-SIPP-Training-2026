package Notification;

import java.util.Scanner;

public class NotificationMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Notification[] notifications = new Notification[3];

        System.out.print("Enter Recipient Name for Email: ");
        String emailName = sc.nextLine();

        System.out.print("Enter Email Message: ");
        String emailMsg = sc.nextLine();

        notifications[0] =
                new EmailNotification(emailName, emailMsg);

        System.out.print("\nEnter Recipient Name for SMS: ");
        String smsName = sc.nextLine();

        System.out.print("Enter SMS Message: ");
        String smsMsg = sc.nextLine();

        notifications[1] =
                new SMSNotification(smsName, smsMsg);

        System.out.print("\nEnter Recipient Name for Push Notification: ");
        String pushName = sc.nextLine();

        System.out.print("Enter Push Message: ");
        String pushMsg = sc.nextLine();

        notifications[2] =
                new PushNotification(pushName, pushMsg);

        System.out.println("\n========== SENT NOTIFICATIONS ==========\n");

        // Dynamic Method Dispatch
        for (Notification notification : notifications) {
            notification.sendNotification();
            System.out.println();
        }

        sc.close();
    }
}