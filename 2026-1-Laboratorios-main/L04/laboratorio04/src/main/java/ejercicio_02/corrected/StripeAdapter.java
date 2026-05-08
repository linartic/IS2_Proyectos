package ejercicio_02.corrected;

public class StripeAdapter implements PaymentProcessor {

    private StripeAPI stripeAPI;


    public StripeAdapter(StripeAPI stripeAPI) {
        this.stripeAPI = stripeAPI;
    }

    public void pay(double amount){
        stripeAPI.makeCharge(amount);
    }
}
