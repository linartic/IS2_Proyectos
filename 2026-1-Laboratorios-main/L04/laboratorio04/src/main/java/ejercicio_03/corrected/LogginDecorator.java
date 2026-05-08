package ejercicio_03.corrected;

import ejercicio_02.corrected.PaymentProcessor;

public class LogginDecorator extends PaymentDecorator {

    public LogginDecorator(PaymentProcessor wrapped) {
        super(wrapped);
    }

    @Override
    public void pay(double amount) {
        System.out.println("[LOG] Iniciando pago...");
        System.out.println("Pagando: " + amount);
        System.out.println("[LOG] Pago completado");
    }

}
