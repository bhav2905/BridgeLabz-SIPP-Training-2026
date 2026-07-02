public class Bus extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 15;
    }
}