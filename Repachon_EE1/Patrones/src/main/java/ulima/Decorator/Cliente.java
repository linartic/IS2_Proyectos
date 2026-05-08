package ulima.Decorator;

public class Cliente {
    static void main() {

        Espresso cafe = new Espresso("cafe simple");
        Beverage cafeConLeche = new Milk("leche", cafe);
        Beverage cafe_leche_chocolatada = new Chocolate("chocolate",cafeConLeche);

        System.out.println(cafe_leche_chocolatada.cost());
    }
}
