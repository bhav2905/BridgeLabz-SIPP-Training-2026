public class Car extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 8;
    }
}