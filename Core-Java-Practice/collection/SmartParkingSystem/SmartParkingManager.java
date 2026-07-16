import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingManager {

    ArrayList<String> vehicles = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // Add Vehicle
    public void vehicleEntry() {

        System.out.print("Enter Vehicle Registration Number: ");
        String vehicle = sc.nextLine();

        if (vehicles.contains(vehicle)) {

            System.out.println("Vehicle is already parked.");

        } else {

            vehicles.add(vehicle);
            System.out.println("Vehicle Entered Successfully.");
        }
    }

    // Remove Vehicle
    public void vehicleExit() {

        System.out.print("Enter Vehicle Registration Number: ");
        String vehicle = sc.nextLine();

        if (vehicles.remove(vehicle)) {

            System.out.println("Vehicle Exited Successfully.");

        } else {

            System.out.println("Vehicle Not Found.");
        }
    }

    // Search Vehicle
    public void searchVehicle() {

        System.out.print("Enter Vehicle Registration Number: ");
        String vehicle = sc.nextLine();

        if (vehicles.contains(vehicle)) {

            System.out.println("Vehicle is Currently Parked.");

        } else {

            System.out.println("Vehicle is Not Parked.");
        }
    }

    // Display Vehicles
    public void displayVehicles() {

        System.out.println("\n===== PARKED VEHICLES =====");

        if (vehicles.isEmpty()) {

            System.out.println("Parking is Empty.");

        } else {

            for (String vehicle : vehicles) {

                System.out.println(vehicle);
            }
        }

        System.out.println("\nTotal Occupied Parking Slots : " + vehicles.size());
    }

    public static void main(String[] args) {

        SmartParkingManager parking = new SmartParkingManager();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SMART PARKING SYSTEM =====");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    parking.vehicleEntry();
                    break;

                case 2:
                    parking.vehicleExit();
                    break;

                case 3:
                    parking.searchVehicle();
                    break;

                case 4:
                    parking.displayVehicles();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}