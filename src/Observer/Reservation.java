package Observer;
import java.util.ArrayList;
import java.util.List;

public class Reservation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String reservationStatus;

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Reservation status changed to: " + reservationStatus);
        }
    }
}
