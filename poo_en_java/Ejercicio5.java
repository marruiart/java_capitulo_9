/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 *
 * @author: Marina Ruiz Artacho
 **/

import clases.Pizza;
import enums.Enums;

public class Ejercicio5 {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(Enums.Tipo.MARGARITA, Enums.Tamano.MEDIANA);
        Pizza p2 = new Pizza(Enums.Tipo.FUNGHI, Enums.Tamano.FAMILIAR);
        p2.sirve();
        Pizza p3 = new Pizza(Enums.Tipo.CUATRO_QUESOS, Enums.Tamano.MEDIANA);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
}
