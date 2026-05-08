package ejercicio_01.corrected;

public class Main {

    static void main() {

        PaymentFacade facade = new PaymentFacade();

        facade.pay(100);
        facade.pay(1500);
        facade.pay(-10);

    }
}
