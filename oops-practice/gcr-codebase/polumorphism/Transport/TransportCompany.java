import java.util.Scanner;

public class TransportCompany {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicle[] vehicles = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        System.out.print("Enter Distance (km): ");
        double km = sc.nextDouble();

        for (Vehicle v : vehicles) {

            if (v instanceof Car) {

                Car car = (Car) v;
                System.out.println("Car Fuel Cost = " + car.fuelCost(km));

            } else if (v instanceof Bus) {

                Bus bus = (Bus) v;
                System.out.println("Bus Fuel Cost = " + bus.fuelCost(km));

            } else if (v instanceof Bike) {

                Bike bike = (Bike) v;
                System.out.println("Bike Fuel Cost = " + bike.fuelCost(km));

            } else if (v instanceof ElectricCar) {

                ElectricCar electricCar = (ElectricCar) v;
                System.out.println("Electric Car Cost = " + electricCar.fuelCost(km));
            }
        }

        sc.close();
    }
}