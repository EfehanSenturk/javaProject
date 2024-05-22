package Payment;

public class PaymentFactory {
    public static Payment createPayment(String type) {
        switch (type) {
            case "CreditCard":
                return new CreditCardPayment();
            case "PayPal":
                return new PayPalPayment();
            default:
                throw new IllegalArgumentException("Unknown payment type");
        }
    }
}