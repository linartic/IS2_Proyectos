package ejercicio_02.corrected;

public class PayPalAdapter implements PaymentProcessor {

    private PayPalAPI paypalAPI;

    public PayPalAdapter(PayPalAPI paypalAPI) {
        this.paypalAPI = paypalAPI;
    }

    public void pay(double amount){
        paypalAPI.sendPayment(amount);
    }
}
