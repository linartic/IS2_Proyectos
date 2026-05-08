package ejercicio_03.corrected;

import ejercicio_02.corrected.PaymentProcessor;

public class FraudCheckDecorator extends PaymentDecorator{
    public FraudCheckDecorator(PaymentProcessor wrapped) {
        super(wrapped);
    }

    @Override
    public void pay(double amount) {
        if (amount > 1000) {
            System.out.println("⚠ Revisando posible fraude...");
        }
        System.out.println("Pagando: " + amount);
    }
}
