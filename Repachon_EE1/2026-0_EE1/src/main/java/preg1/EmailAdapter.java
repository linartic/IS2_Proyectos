package preg1;

public class EmailAdapter implements CanalComunicacion{

    private EmailAPI emailAPI;

    public EmailAdapter() {
        this.emailAPI = new EmailAPI();
    }

    @Override
    public void enviar(String persona, String mensaje) {
        emailAPI.sendEmail(persona,mensaje);
    }

}