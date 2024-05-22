package ProxyPayment;

public class RealPayment implements Payment1 {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}
