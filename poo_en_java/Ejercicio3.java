/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author: Marina Ruiz Artacho
 **/

import Clases.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Gato gatito = new Gato(true);
        Gato gato = new Gato(false);
        Perro perrito = new Perro(true);
        Perro perro = new Perro(false);
        Pinguino pinguino = new Pinguino();
        Lagarto lagarto = new Lagarto();
        Canario canario = new Canario();

        System.out.print("Soy un lagarto: ");
        lagarto.correr();
        System.out.print("Soy un pingüino: ");
        pinguino.volar();
        System.out.println("Soy un gatito " + gatito.comer("leche"));
        System.out.println("Soy un gato adulto " + gato.comer("leche"));
        System.out.println("Soy un perro adulto " + gato.comer("pienso"));
        System.out.println("Soy un perro adulto " + perro.comer("semillas"));
        System.out.println("Soy un gato adulto " + gato.comer("carne"));
        System.out.println("Soy un pingüino " + pinguino.comer("carne"));
        canario.acicalarse();
        lagarto.tomarSol();
        gato.correr();
        lagarto.correr();
        pinguino.graznar();
        perrito.ladrar();
        gato.maullar();
        lagarto.acicalarse();
    }
}
