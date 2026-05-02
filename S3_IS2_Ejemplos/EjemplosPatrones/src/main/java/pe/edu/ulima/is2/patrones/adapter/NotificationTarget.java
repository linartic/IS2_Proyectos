package pe.edu.ulima.is2.patrones.adapter;

public interface NotificationTarget {
    public void send(String recipient, String content);
}
