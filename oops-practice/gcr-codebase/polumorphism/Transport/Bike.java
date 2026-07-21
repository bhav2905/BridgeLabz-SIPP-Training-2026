public class Bike extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 3;
    }
}