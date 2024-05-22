package Visitor;

public class TaxVisitor implements VehicleVisitor {
    @Override
    public void visit(Car car) {
        double tax = car.getPrice() * 0.10;
        System.out.println("Tax for car: $" + tax);
    }
}
