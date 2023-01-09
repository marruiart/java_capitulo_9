/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases.
 *
 * @author: Marina Ruiz Artacho
 **/

import Vehiculos.*;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Coche pedro = new Coche("Renault", "Captur");
        Coche marta = new Coche("Peugeot", "205");
        Coche edu = new Coche("BMW", "X1");
        Bicicleta sara = new Bicicleta(Bicicleta.TipoBici.BMX);

        System.out.printf("Pedro tiene un %s %s con %d km\n" +
                        "Marta tiene un %s %s con %d km\n" +
                        "Edu tiene un %s %s con %d km\n" +
                        "Sara tiene una bicicleta %s con %d km\n",
                pedro.marca, pedro.modelo, pedro.kilometrosRecorridos,
                marta.marca, marta.modelo, marta.kilometrosRecorridos,
                edu.marca, edu.modelo, edu.kilometrosRecorridos,
                sara.tipo, sara.kilometrosRecorridos);

        System.out.printf("Hay %d vehículos creados\n\n", Coche.getVehiculosCreados());

        int opcion = 0;
        do {
            switch (opcion) {
                case 0 -> System.out.println("¡Hola!");
                case 1 -> sara.recorre(20);
                case 2 -> sara.hacerCaballito();
                case 3 -> {
                    if (Math.random() < 0.5) {
                        pedro.recorre(500);
                    } else {
                        if (Math.random() < 0.8) {
                            marta.recorre(750);
                        } else {
                            edu.recorre(1200);
                        }
                    }
                }
                case 4 -> edu.quemarRueda();
                case 5 -> System.out.printf("\nSara ha recorrido %d km\n", sara.getKilometrosRecorridos());
                case 6 ->
                        System.out.printf("\nPedro ha recorrido %d km\nMarta ha recorrido %d km\nEdu ha recorrido %d km\n",
                                pedro.getKilometrosRecorridos(), marta.getKilometrosRecorridos(), edu.getKilometrosRecorridos());
                case 7 -> System.out.printf("\nEn total han recorrido: %d km\n", Coche.getKilometrosTotales());
                default -> System.out.println("\nNúmero incorrecto\n");
            }
            System.out.printf("\nVEHÍCULOS\n" +
                    "=========\n" +
                    "1. Anda con la bicicleta\n" +
                    "2. Haz el caballito con la bicicleta\n" +
                    "3. Anda con el coche\n" +
                    "4. Quema rueda con el coche\n" +
                    "5. Ver kilometraje de la bicicleta\n" +
                    "6. Ver kilometraje del coche\n" +
                    "7. Ver kilometraje total\n" +
                    "8. Salir\n" +
                    "Elige una opción (1-8): ");
            opcion = s.nextInt();
        } while (opcion != 8);
        System.out.println("Adiós!");
        s.close();
    }
}
