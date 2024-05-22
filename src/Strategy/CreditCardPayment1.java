package Strategy;

public class CreditCardPayment1 implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card");
    }
}
