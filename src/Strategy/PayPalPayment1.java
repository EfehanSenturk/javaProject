package Strategy;

public class PayPalPayment1 implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using PayPal");
    }
}
