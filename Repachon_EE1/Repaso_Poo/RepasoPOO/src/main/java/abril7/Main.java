package abril7;

import abril7.SerHumano;

public class Main {

    static void main() {
        //TIPOS DE VARIABLES
        //public -- se puede usar desde fuera de la clase
        //private -- solo lo puede utilizar la misma clase || NO SE HEREDAN
        //protected -- los hijos pueden heredarlas del padre, pero no se puede acceder desde fuera de la calse


        System.out.println("miauuuuuu");
        int a = 1;
        System.out.println(a++); //imprime valor y luego suma | print(1) -- a = 2
        System.out.println(++a); //suma y luego imprime | a = 2+1 = 3 -- print(3)

        SerHumano marce = new SerHumano("marce","marron claro",33);
        System.out.println(marce.getNombre());


        //cositas
        SerHumano[] personas = new SerHumano[3]; //3 personitas
        //arreglos de Clases (son referencias) pueden ser nulos
        int[] numeros = new int[3];
        //numeros[0] = null; // como son **valores primitivos** (int,,boolean,etc) no almacenan nulls
        // nombres[0] = null; //String si puede pq es una CLASE

        //iteraciones
        personas[0] = marce;
        personas[1] = new SerHumano("rui","amarillos",18);
        personas[2] = new SerHumano("tsukasa","naranja",18);
        for(SerHumano serHumano : personas){
            //por cada "serhumano" del array...
            System.out.println(serHumano.getNombre());
        }
    }
}
