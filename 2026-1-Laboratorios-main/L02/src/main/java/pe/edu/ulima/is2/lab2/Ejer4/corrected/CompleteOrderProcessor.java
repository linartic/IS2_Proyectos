package pe.edu.ulima.is2.lab2.Ejer4.corrected;

public class CompleteOrderProcessor {
    private OrderManager orderManager;
    private PaymentHandler paymentHandler;
    private ShippingService shippingService;
    private InventoryManager inventoryManager;
    private NotificationSender notificationSender;
    private ReportGenerator reportGenerator;

    public CompleteOrderProcessor(OrderManager orderManager, PaymentHandler paymentHandler,
                                  NotificationSender notificationSender, ReportGenerator reportGenerator,
                                  InventoryManager inventoryManager, ShippingService shippingService) {
        this.orderManager = orderManager;
        this.paymentHandler = paymentHandler;
        this.notificationSender = notificationSender;
        this.reportGenerator = reportGenerator;
        this.inventoryManager = inventoryManager;
        this.shippingService = shippingService;
    }

    public void Ejecutar(String customerId, String[] productId) {
        orderManager.createOrder(customerId, productId);
        paymentHandler.processPayment("ID-1", "Card", "Data_Pago");
        shippingService.calculateShippingCost("ID-1");
        notificationSender.sendOrderConfirmation("ID-1");
        System.out.println("Orden Completada");
    }


}
