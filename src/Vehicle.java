// Vehicle.java
public class Vehicle {
    private String type;
    private String model;
    private double price;
    private int seats;

    private Vehicle(VehicleBuilder builder) {
        this.type = builder.type;
        this.model = builder.model;
        this.price = builder.price;
        this.seats = builder.seats;
    }

    public static class VehicleBuilder {
        private String type;
        private String model;
        private double price;
        private int seats;

        public VehicleBuilder(String type, String model) {
            this.type = type;
            this.model = model;
        }

        public VehicleBuilder price(double price) {
            this.price = price;
            return this;
        }

        public VehicleBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    @Override
    public String toString() {
        return "Vehicle [type=" + type + ", model=" + model + ", price=" + price + ", seats=" + seats + "]";
    }
}

// Usage


