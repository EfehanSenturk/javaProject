package DecoratorVehicle;

public class GPSDecorator extends VehicleDecorator {
    public GPSDecorator(Vehicle1 vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + ", GPS";
    }

    @Override
    public double getCost() {
        return decoratedVehicle.getCost() + 200;
    }
}