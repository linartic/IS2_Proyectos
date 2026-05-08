package ejercicio_02.corrected;

public class MercadoPagoAdapter implements PaymentProcessor {

    private MercadoPagoAPI mercadoPagoAPI;


    public MercadoPagoAdapter(MercadoPagoAPI mercadoPagoAPI) {
        this.mercadoPagoAPI = mercadoPagoAPI;
    }

    public void pay(double amount){
        mercadoPagoAPI.pagar(amount);
    }
}
