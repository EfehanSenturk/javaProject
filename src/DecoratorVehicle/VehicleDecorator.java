package DecoratorVehicle;

public abstract class VehicleDecorator implements Vehicle1 {
    protected Vehicle1 decoratedVehicle;

    public VehicleDecorator(Vehicle1 vehicle) {
        this.decoratedVehicle = vehicle;
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedVehicle.getCost();
    }
}
