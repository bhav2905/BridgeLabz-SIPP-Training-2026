public class ElectricCar extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 2;
    }
}