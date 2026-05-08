package ulima.Singleton;

public class Main {

    static void main() {
        System.out.println("SINGLETON BD");
        ServiceA a = new ServiceA();
        a.processData();

        ServiceB b = new ServiceB();
        b.reporte("hola");

    }
}
