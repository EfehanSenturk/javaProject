package ProxyPayment;

public class PaymentProxy implements Payment1 {
    private RealPayment realPayment;
    private boolean isAuthorized;

    public PaymentProxy(boolean isAuthorized) {
        this.realPayment = new RealPayment();
        this.isAuthorized = isAuthorized;
    }

    @Override
    public void processPayment(double amount) {
        if (isAuthorized) {
            realPayment.processPayment(amount);
        } else {
            System.out.println("Payment not authorized");
        }
    }
}
