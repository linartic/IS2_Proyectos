package pe.edu.ulima.is2.lab2.tests;


import pe.edu.ulima.is2.lab2.Ejer1.corrected.DiscountCalculator;
import pe.edu.ulima.is2.lab2.Ejer1.corrected.User;
import pe.edu.ulima.is2.lab2.Ejer1.corrected.UserReportGenerator;
import pe.edu.ulima.is2.lab2.Ejer2.corrected.*;
import pe.edu.ulima.is2.lab2.Ejer3.corrected.DigitalProduct;
import pe.edu.ulima.is2.lab2.Ejer3.corrected.PhysicalProduct;
import pe.edu.ulima.is2.lab2.Ejer3.corrected.Product;
import pe.edu.ulima.is2.lab2.Ejer3.corrected.ServiceProduct;
import pe.edu.ulima.is2.lab2.Ejer4.corrected.*;
import pe.edu.ulima.is2.lab2.Ejer5.corrected.DependencyInjector;
import pe.edu.ulima.is2.lab2.Ejer5.corrected.OrderService;

import java.util.ArrayList;
import java.util.List;

public class SolidViolationsDemo {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE VIOLACIONES SOLID ===\n");

        // TODO: Ejecutar ejemplos de cada violación
        // TODO: Mostrar problemas que causan
        // TODO: Ejecutar versiones corregidas
        // TODO: Comparar diferencias

        demonstrateSRPViolation();
        demonstrateOCPViolation();
        demonstrateLSPViolation();
        demonstrateISPViolation();
        demonstrateDIPViolation();
    }

    private static void demonstrateSRPViolation() {
        System.out.println("--- SRP Violation ---");
        // TODO: Implementar demostración
        User user = new User("Pepito","p@ulima.edu.pe","PREMIUM",250);

        DiscountCalculator calculator = new DiscountCalculator();
        UserReportGenerator generator = new UserReportGenerator(calculator);

        System.out.println(generator.generateUserReport(user));
    }

    private static void demonstrateOCPViolation() {
        System.out.println("--- OCP Violation ---");
        // TODO: Implementar demostración
        PaymentProcessor procesador = new PaymentProcessor();
        PaymentMethod tarjeta = new CreditCardPayment();
        PaymentMethod bitcoin = new ApplePayPayment();
        PaymentMethod transferencia = new BankTransferPayment();
        PaymentMethod paypal = new PayPalPayment();

        procesador.registerPaymentMethod(tarjeta);
        procesador.registerPaymentMethod(bitcoin);
        procesador.registerPaymentMethod(transferencia);
        procesador.registerPaymentMethod(paypal);

        if(procesador.processPayment(tarjeta.getPaymentType(), 400, "1231231231231231")) {
            System.out.println("Proceso de pago correcto");
        } else{
            System.out.println("Error");
        }
    }

    private static void demonstrateLSPViolation() {
        System.out.println("--- LSP Violation ---");
        // TODO: Implementar demostración
        List<Product> lista = new ArrayList<>();

        PhysicalProduct prod1 = new PhysicalProduct("Nintendo Switch",3000.0, 5.5);
        DigitalProduct prod2 = new DigitalProduct("Tomodachi Life",250.00,"htt:/UrlPrueba",50);
        ServiceProduct prod3 = new ServiceProduct("Mantenimiento",80,90);

        lista.add(prod1);
        lista.add(prod2);
        lista.add(prod3);

        System.out.println("PRUEBAS");
        for(Product p : lista){
            System.out.println("El producto " + p.getName() + " tiene un valor de: "+p.calculatePrice());
        }

        System.out.println("\nProducto fisico---");
        System.out.println("Costo de envio: "+ prod1.calculateShipingCost());
        System.out.println("Entrega fisica?: "+prod1.requiresPhysicalDelivery());

        System.out.println("\nProducto digital---");
        System.out.println("Puede descargar su producto aqui: "+prod2.getDownloadUrl()+"\nTamaño de descarga: "+prod2.getFileSize());

        System.out.println("\nServicio---");
        prod3.scheduleService();
        System.out.println("Duracion del servicio: "+prod3.getServiceDuration());
    }

    private static void demonstrateISPViolation() {
        System.out.println("\n--- ISP Violation ---");
        // TODO: Implementar demostración

        OrderManager manager = new BasicOrderProcessor();
        ShippingService envio = new ShippingOrderProcessor();
        PaymentHandler pago = new PaymentHandler() {
            @Override
            public boolean processPayment(String orderId, String paymentMethod, String paymentData) {
                return false;
            }

            @Override
            public void processRefund(String orderId, double amount) {

            }
        };

        InventoryManager inv = new InventoryManager() {
            @Override
            public boolean checkProductAvailability(String productId, int quantity) {
                return false;
            }

            @Override
            public void reserveProduct(String productId, int quantity) {

            }

            @Override
            public void releaseProductReservation(String productId, int quantity) {

            }
        };

        NotificationSender noti = new NotificationSender() {
            @Override
            public void sendOrderConfirmation(String orderId) {

            }

            @Override
            public void sendShippingNotification(String orderId) {

            }

            @Override
            public void sendDeliveryNotification(String orderId) {

            }
        };

        ReportGenerator report = new ReportGenerator() {
            @Override
            public String generateOrderReport(String orderId) {
                return "";
            }

            @Override
            public String generateDailyReport(String date) {
                return "";
            }

            @Override
            public String generateCustomerReport(String customerId) {
                return "";
            }
        };

        /////////////////////////
        CompleteOrderProcessor proceso = new CompleteOrderProcessor(manager,pago,noti,report,inv,envio);

        String[] carrito = new String[]{"Teclado","Cargador"};
        proceso.Ejecutar("ID-100",carrito);


    }

    private static void demonstrateDIPViolation() {
        System.out.println("--- DIP Violation ---");
        // TODO: Implementar demostración
        System.out.println("Implementaciones concretas------");

        OrderService s1 = DependencyInjector.createOrderService();
        String[] productos = new String[]{"Juego","Consola"};
        s1.processOrder("ID-2212",productos,"email");

        System.out.println("\nImplementaciones mock para testing------");

        OrderService s2 = DependencyInjector.createOrderService();
        String[] prueba = new String[]{"test1","test2"};
        s2.processOrder("ID-2406",prueba,"test");
    }
}