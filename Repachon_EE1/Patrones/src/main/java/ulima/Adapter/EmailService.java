package ulima.Adapter;

public class EmailService implements NotificationTarget{
    @Override
    public void send(String recipient, String content) {
        LegacyEmailLib lib = new LegacyEmailLib();
        lib.sendEmail(recipient,"MSG PRUEBA", content);

    }
}
