package pe.edu.ulima.is2.lab2.Ejer5.corrected;

public class MockNotificationService implements NotificationService{
    @Override
    public void sendNotification(String type, String recipient, String message) {
        System.out.println("MockNotification - "+message);
    }
}
