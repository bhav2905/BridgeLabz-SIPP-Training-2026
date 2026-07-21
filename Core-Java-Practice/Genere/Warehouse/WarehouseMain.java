package Warehouse;
public class WarehouseMain {

    public static void main(String[] args) {

        Storage<Electronics> electronicStorage = new Storage<>();

        electronicStorage.addItem(
                new Electronics(101, "Laptop"));

        electronicStorage.addItem(
                new Electronics(102, "Smart Phone"));



        Storage<Groceries> groceryStorage = new Storage<>();

        groceryStorage.addItem(
                new Groceries(201, "Rice"));

        groceryStorage.addItem(
                new Groceries(202, "Sugar"));



        Storage<Furniture> furnitureStorage = new Storage<>();

        furnitureStorage.addItem(
                new Furniture(301, "Chair"));

        furnitureStorage.addItem(
                new Furniture(302, "Table"));


        System.out.println("Electronics");

        WarehouseUtility.displayItems(
                electronicStorage.getItems());


        System.out.println("Groceries");

        WarehouseUtility.displayItems(
                groceryStorage.getItems());



        System.out.println("Furniture");

        WarehouseUtility.displayItems(
                furnitureStorage.getItems());
    }
}
