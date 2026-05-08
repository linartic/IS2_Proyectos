package ejercicio_01.corrected;

public class PaymentValidator {
    public void validate(double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Monto inválido");
        }
        if(amount > 1000) {
            System.out.println("⚠ Pago requiere revisión adicional");
        }


    }
}
