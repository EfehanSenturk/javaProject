package IteratorVehicle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VehicleCollection implements Iterable<Vehicle2> {
    private List<Vehicle2> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle2 vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public Iterator<Vehicle2> iterator() {
        return vehicles.iterator();
    }
}
