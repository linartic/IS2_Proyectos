package pe.edu.ulima.is2.lab2.Ejer5.corrected;

public class DependencyInjector {

    public static OrderService createTestOrderService(){
        MockNotificationService notification = new MockNotificationService();
        MockLogger log = new MockLogger();
        MockRepository repo = new MockRepository();

        return new OrderService(notification,log,repo);
    }

    public static OrderService createOrderService(){
        EmailNotificationService email = new EmailNotificationService();
        FileLoggerService file = new FileLoggerService();
        DatabaseOrderRepository DB = new DatabaseOrderRepository();

        return new OrderService(email,file,DB);
    }



}
