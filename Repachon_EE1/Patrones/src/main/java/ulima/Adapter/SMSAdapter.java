package ulima.Adapter;

public class SMSAdapter implements NotificationTarget{

    private FastSMS_Adaptee smsService;

    public SMSAdapter(FastSMS_Adaptee smsService) {
        this.smsService = smsService;
    }


    @Override
    public void send(String recipient, String content) {
        System.out.println("SMS a: "+recipient);
    }
}
