/**
 * Implementa la clase Caballo con los atributos y métodos que pueda tener. Pruébala creando
 * instancias y aplicándole algunos métodos.
 *
 * @author: Marina Ruiz Artacho
 **/

import clases.animales.Caballo;

public class Ejercicio1 {
    public static void main(String[] args) {
        Caballo perdigon = new Caballo("Perdigón", "Jaspeado", "Appaloosa", Caballo.Sexo.MACHO, "10-01-2017", 420);

        String sexo = perdigon.sexo.equals(Caballo.Sexo.MACHO) ? "caballo" : "yegua";
        System.out.printf("%s es un%s %s", perdigon.nombre, sexo.equals("caballo") ? "" : "a", sexo);
        if (perdigon.velocidad == 0)
            System.out.printf("%s está parado a %d km/h\n", perdigon.nombre, perdigon.velocidad);
        perdigon.irAlPaso();
        System.out.printf("%s va al paso a %d km/h\n", perdigon.nombre, perdigon.velocidad);
        perdigon.irAlTrote();
        System.out.printf("%s va al trote a %d km/h\n", perdigon.nombre, perdigon.velocidad);
        perdigon.relincha();
    }
}
