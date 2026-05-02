package pe.edu.ulima.is2.lab2.Ejer1.corrected;

public class NotificationService {

    public void sendWelcomeEmail(User usuario) {
        System.out.println("Enviando email de bienvenida a: " + usuario.getEmail());
        System.out.println("Asunto: ¡Bienvenido " + usuario.getName() + "!");
        System.out.println("Cuerpo: Gracias por registrarte como usuario " + usuario.getUserType());
    }
}
