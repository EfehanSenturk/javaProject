package Visitor;

public class Car implements Vehicle3 {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}