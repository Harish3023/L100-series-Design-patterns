package structural.bridge;
public class Main {
    public static void main(String[] args) {
        Payment onlinePayment = new OnlineOrderPayment(new RazorpayGateway());
        onlinePayment.makePayment(1500);

        Payment subPayment = new SubscriptionPayment(new PayPalGateway());
        subPayment.makePayment(499);

        Payment stripeOrder = new OnlineOrderPayment(new StripeGateway());
        stripeOrder.makePayment(999);
    }
}