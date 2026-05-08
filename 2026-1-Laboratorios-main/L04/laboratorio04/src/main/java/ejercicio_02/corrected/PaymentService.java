package ejercicio_02.corrected;

public class PaymentService {
    public void processPayment(PaymentProcessor processor, double amount) {
        processor.pay(amount);
    }
}
