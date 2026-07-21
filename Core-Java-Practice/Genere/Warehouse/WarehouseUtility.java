package Warehouse;

import java.util.List;

public class WarehouseUtility {

    public static void displayItems(List<? extends WarehouseItem> items) {

        System.out.println("----------------------------");

        for (WarehouseItem item : items) {

            System.out.println(item);
        }

        System.out.println("----------------------------");
    }
}