package ejercicio_03.corrected;

import ejercicio_02.corrected.PaymentProcessor;

public abstract class PaymentDecorator implements PaymentProcessor {

    protected PaymentProcessor wrapped;

    public PaymentDecorator(PaymentProcessor wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public abstract void pay(double amount);

}
