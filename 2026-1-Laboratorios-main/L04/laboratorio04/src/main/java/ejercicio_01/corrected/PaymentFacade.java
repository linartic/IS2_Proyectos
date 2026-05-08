package ejercicio_01.corrected;

import javax.xml.validation.Validator;

public class PaymentFacade {

    private PaymentValidator validator;
    private PaymentGateway gateway;
    private NotificationService notifier;

    public PaymentFacade() {
        this.validator = new PaymentValidator();
        this.gateway = new PaymentGateway();
        this.notifier = new NotificationService();
    }


    public void pay(double amount){
        System.out.println("\nSimulacion de Pago");
        validator.validate(amount);
        gateway.process(amount);
        notifier.sendReceipt(amount);


    }

}
