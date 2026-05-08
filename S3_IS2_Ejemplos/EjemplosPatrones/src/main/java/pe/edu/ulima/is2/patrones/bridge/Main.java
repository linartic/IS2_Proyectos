package pe.edu.ulima.is2.patrones.bridge;

public class Main {

    static void main() {

        Ventana ven = new VentanaTriangular(new Implementor() {
            @Override
            public void dibujar() {
                System.out.println("Dibujando una Venta Triangular en Windows");
            }
        });

        Ventana ven2 = new VentanaCircular(new Implementor() {
            @Override
            public void dibujar() {
                System.out.println("Se dibujará una Venta Circular en Mac");
            }
        });

        ven.draw();
        ven2.draw();

    }

}
