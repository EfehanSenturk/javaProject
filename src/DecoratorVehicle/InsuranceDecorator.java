package DecoratorVehicle;

public class InsuranceDecorator extends VehicleDecorator {
    public InsuranceDecorator(Vehicle1 vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + ", Insurance";
    }

    @Override
    public double getCost() {
        return decoratedVehicle.getCost() + 500;
    }
}
