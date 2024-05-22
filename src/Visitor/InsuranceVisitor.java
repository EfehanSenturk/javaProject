package Visitor;

public class InsuranceVisitor implements VehicleVisitor {
    @Override
    public void visit(Car car) {
        double insurance = car.getPrice() * 0.05;
        System.out.println("Insurance for car: $" + insurance);
    }
}
