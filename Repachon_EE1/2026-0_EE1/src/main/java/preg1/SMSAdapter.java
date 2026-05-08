package preg1;

public class SMSAdapter implements CanalComunicacion{
    private SMSAPI smsAPI;

    public SMSAdapter() {
        this.smsAPI = new SMSAPI();
    }

    @Override
    public void enviar(String persona, String mensaje) {
        smsAPI.sendSMS(persona,mensaje);
    }
}
