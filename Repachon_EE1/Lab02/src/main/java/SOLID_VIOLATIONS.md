# PRINCIPIOS SOLID

## SRP — Single Responsability “Responsabilidad Única”
**"Una clase debe tener **una** sola responsabilidad"**

Cada clase debería encargarse de una única función o motivo de cambio.

#### ¿Cuando se viola?
- una clase tiene muchas tareas (funciones)
- cambia una funcoinalidad --- lleva a modificar la misma clase x diferentes razones
- se siente q la clase esta haciendo demasiado

### Violación
```java
class Usuario {
    void guardarBD() {}
    void enviarCorreo() {}
    void generarReportePDF() {}
}
```
### Solucion
```
class Usuario {}

class UsuarioDAO {
    void guardarBD() {}
}

class EmailService {
    void enviarCorreo() {}
}

class ReporteService {
    void generarReportePDF() {}
}
```

### OCD — Open/Closed “Abierto/Cerrado”
**"Abierto para extensión, cerrado para modificación"**

Se debe poder agregar nuevas funciones, sin modificar código existente

#### ¿Cuando se viola?
- cuando se modifica codigo antiguo (ya funcional)
- agregar nuevo contenido requiere modificar

### Violación
```java
class Pago {

    void procesar(String tipo) {

        if(tipo.equals("tarjeta")) {
            System.out.println("Pago con tarjeta");
        }

        else if(tipo.equals("paypal")) {
            System.out.println("Pago con PayPal");
        }
    }
}
```
### Solucion
```
interface MetodoPago {
    void procesar();
}

class PagoTarjeta implements MetodoPago {

    public void procesar() {
        System.out.println("Pago con tarjeta");
    }
}

class PagoPaypal implements MetodoPago {

    public void procesar() {
        System.out.println("Pago con PayPal");
    }
}
```
## LSP — Liskov Substitution “Sustitución de Liskov”
**"Una subclase debe poder reemplazar a su clase padre"**

las clases "hijas" deben comportarse correctamente cuando se usan como su padre

#### ¿Cuando se viola?
- no cumple con comportamiento esperados
- necesita métodos "extras" o excepciones para cumplir lo q ya le da su padre
- subclase no se comporta como la clase base

### Violación
```java
class Ave {

    void volar() {
        System.out.println("Volando");
    }
}

class Pinguino extends Ave {

    @Override
    void volar() {
        throw new UnsupportedOperationException();
    }
}
```
### Solucion
```
class Ave {}

interface Volador {
    void volar();
}

class Aguila extends Ave implements Volador {

    public void volar() {
        System.out.println("Volando");
    }
}

class Pinguino extends Ave {}
```

## ISP — Interface Segregation “Segregación de Interfaces”
**"No obligar una clase a implementar métodos que NO necesita"**

Las interfaces deben ser pequeñas y especificas

#### ¿Cuando se viola?
- metodos vacios / innecesarios / q lanzan excepciones
- una interfaz "obliga" a implementar funcionalidades irrelevantes

### Violación
```java
interface Trabajador {
    void trabajar();
    void comer();
}

class Robot implements Trabajador {

    public void trabajar() {
        System.out.println("Trabajando");
    }

    public void comer() {
        // No hace nada
    }
}
```
### Solucion
```
interface Trabajador {
    void trabajar();
}

interface Comedor {
    void comer();
}

class Humano implements Trabajador, Comedor {

    public void trabajar() {
        System.out.println("Trabajando");
    }

    public void comer() {
        System.out.println("Comiendo");
    }
}

class Robot implements Trabajador {

    public void trabajar() {
        System.out.println("Trabajando");
    }
}
```

## DIP — Dependency Inversion”Inversió de Dependencias”
**"Depende de abstracciones, no de implementaciones"**

Las clases no deberian depender directamente de clases concretas, sino de interfaces o asbtracciones

#### ¿Cuando se viola?
- una clase "alto nivel" depende directamente de implementaciones especificas "clase de bajo nivel"

### Violación
```java
class MotorGasolina {

    void encender() {
        System.out.println("Motor gasolina encendido");
    }
}

class Auto {

    MotorGasolina motor = new MotorGasolina();

    void arrancar() {
        motor.encender();
    }
}
```
### Solucion
```
interface Motor {
    void encender();
}

class MotorGasolina implements Motor {

    public void encender() {
        System.out.println("Motor gasolina encendido");
    }
}

class Auto {

    private Motor motor;

    public Auto(Motor motor) {
        this.motor = motor;
    }

    void arrancar() {
        motor.encender();
    }
}
```