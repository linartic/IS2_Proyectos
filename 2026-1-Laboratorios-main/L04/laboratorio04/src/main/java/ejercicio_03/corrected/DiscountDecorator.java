package ejercicio_03.corrected;

import ejercicio_02.corrected.PaymentProcessor;

public class DiscountDecorator extends PaymentDecorator{
    public DiscountDecorator(PaymentProcessor wrapped) {
        super(wrapped);
    }

    @Override
    public void pay(double amount) {
        double discounted = amount * 0.9;
        System.out.println("Pagando con descuento: " + discounted);
    }
}
