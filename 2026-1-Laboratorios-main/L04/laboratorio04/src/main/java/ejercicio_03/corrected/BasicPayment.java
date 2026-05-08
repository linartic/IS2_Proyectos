package ejercicio_03.corrected;

public class BasicPayment implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando: " + amount);
    }
}
