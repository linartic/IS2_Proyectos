package com.ulima.is2.og;

public class Main {

    static void main(){
        System.out.println("SIMULACIÓN DE PROBLE: SIN SINGLETON");
        ServiceA sa = new ServiceA();
        ServiceB sb = new ServiceB();

        System.out.println("Servicio A\n");
        sa.processData();

        System.out.println("Servicio B");
        sb.generateReport();

    }
}
