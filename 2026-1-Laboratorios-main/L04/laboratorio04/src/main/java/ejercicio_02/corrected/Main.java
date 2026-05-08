package ejercicio_02.corrected;

public class Main {

    static void main() {
        System.out.println("ADAPTER\n");

        PayPalAPI pAPI = new PayPalAPI();
        PaymentProcessor paypal = new PayPalAdapter(pAPI);
        paypal.pay(500);

        StripeAPI sAPI = new StripeAPI();
        PaymentProcessor stripe = new StripeAdapter(sAPI);
        stripe.pay(100);

        MercadoPagoAPI mAPI = new MercadoPagoAPI();
        PaymentProcessor mercado = new MercadoPagoAdapter(mAPI);
        mercado.pay(2000);


    }
}
