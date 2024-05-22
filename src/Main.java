import Payment.*;
import Message.*;
import ProxyPayment.*;
import DecoratorVehicle.*;
import IteratorVehicle.*;
import Strategy.*;
import Visitor.*;
import Observer.*;
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle.VehicleBuilder("Car", "Sedan")
                .price(25000)
                .seats(4)
                .build();
        System.out.println(car);
        Payment payment = PaymentFactory.createPayment("CreditCard");
        payment.processPayment(250);
        System.out.println(payment);
        Notification textNotification = new TextNotification(new SmsSender());
        textNotification.notify("Your reservation is confirmed.");

        Notification htmlNotification = new HtmlNotification(new EmailSender());
        htmlNotification.notify("Your reservation is confirmed.");
        System.out.println(textNotification + " " + htmlNotification);

        Payment1 payment1 = new PaymentProxy(true);
        payment.processPayment(100);

        Payment1 unauthorizedPayment = new PaymentProxy(false);
        unauthorizedPayment.processPayment(100);
        System.out.println(payment1 + "    " + unauthorizedPayment);

        Vehicle1 basicCar = new BasicCar();
        System.out.println(basicCar.getDescription() + " $" + basicCar.getCost());

        Vehicle1 carWithGPS = new GPSDecorator(new BasicCar());
        System.out.println(carWithGPS.getDescription() + " $" + carWithGPS.getCost());

        Vehicle1 carWithGPSAndInsurance = new InsuranceDecorator(new GPSDecorator(new BasicCar()));
        System.out.println(carWithGPSAndInsurance.getDescription() + " $" + carWithGPSAndInsurance.getCost());


        //Burası Iterator

        System.out.println("----------------------------------------------------------------");

        VehicleCollection vehicleCollection = new VehicleCollection();
        vehicleCollection.addVehicle(new Vehicle2("Sedan"));
        vehicleCollection.addVehicle(new Vehicle2("SUV"));

        for (Vehicle2 vehicle : vehicleCollection) {
            System.out.println(vehicle.getModel());
        }


        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment1());
        paymentContext.executePayment(100);

        paymentContext.setPaymentStrategy(new PayPalPayment1());
        paymentContext.executePayment(200);


        Car car1 = new Car(20000);
        VehicleVisitor taxVisitor = new TaxVisitor();
        VehicleVisitor insuranceVisitor = new InsuranceVisitor();

        car1.accept(taxVisitor);
        car1.accept(insuranceVisitor);


        Reservation reservation = new Reservation();

        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Jane");

        reservation.registerObserver(customer1);
        reservation.registerObserver(customer2);

        reservation.setReservationStatus("Confirmed");


    }
}