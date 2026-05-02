package pe.edu.ulima.is2.patrones.adapter;

public class SMSAdapter implements NotificationTarget{

    private FastSMS_Adaptee smsService;

    public SMSAdapter(FastSMS_Adaptee smsService) {
        this.smsService = smsService;
    }

    @Override
    public void send(String recipient, String content) {
        smsService.sendInstanceMessage(recipient, content);
    }
}
