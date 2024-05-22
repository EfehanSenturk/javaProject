package DecoratorVehicle;

public class BasicCar implements Vehicle1 {
    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double getCost() {
        return 15000;
    }
}
