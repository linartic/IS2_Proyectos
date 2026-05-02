package pe.edu.ulima.is2.lab2.Ejer5.corrected;

import pe.edu.ulima.is2.lab2.violations.Ejer5.EmailNotifier;
import pe.edu.ulima.is2.lab2.violations.Ejer5.SMSNotifier;

public class OrderService {
    private  NotificationService notificationService;
    private  Logger logger;
    private  OrderRepository repository;

    public OrderService(NotificationService notificationService, Logger logger, OrderRepository repository) {
        this.notificationService = notificationService;
        this.logger = logger;
        this.repository = repository;
    }

    EmailNotifier emailNotifier = new EmailNotifier();
    SMSNotifier smsNotifier = new SMSNotifier();

    public void processOrder(String customerId, String[] productIds, String notificationType) {



        logger.log("Iniciando procesamiento de pedido para cliente: " + customerId);

        // Lógica de negocio
        String customerData = repository.getCustomerData(customerId);
        logger.log("Datos de cliente obtenidos: " + customerData);

        // Crear pedido
        String orderId = "ORDER-" + System.currentTimeMillis();
        String orderData = "Pedido " + orderId + " para cliente " + customerId;

        // Guardar en base de datos
        repository.saveOrder(orderData);
        logger.log("Pedido guardado: " + orderId);

        // Enviar notificación (fuertemente acoplado)
        if ("EMAIL".equals(notificationType)) {
            emailNotifier.sendEmail("customer@email.com",
                    "Confirmación de Pedido",
                    "Su pedido " + orderId + " ha sido procesado");
        } else if ("SMS".equals(notificationType)) {
            smsNotifier.sendSMS("+123456789",
                    "Pedido " + orderId + " confirmado");
        }

        logger.log("Pedido procesado completamente: " + orderId);
    }

    public void cancelOrder(String orderId) {
        logger.log("Cancelando pedido: " + orderId);

        repository.saveOrder("CANCELLED: " + orderId);
        emailNotifier.sendEmail("customer@email.com",
                "Pedido Cancelado",
                "Su pedido " + orderId + " ha sido cancelado");

        logger.log("Pedido cancelado: " + orderId);
    }
}
