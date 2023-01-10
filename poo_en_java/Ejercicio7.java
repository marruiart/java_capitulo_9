/**
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
 * la zona de compra-venta con 200 entradas disponibles y la zona vip
 * con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 * venderlas.
 *
 * @author: Marina Ruiz Artacho
 **/

import clases.expocoches.Zona;

import java.util.Scanner;

public class Ejercicio7 {
    private static void vender(Zona salaPrincipal, Zona zonaCompraVenta, Zona zonaVip, int zona, int entradas) {
        switch (zona) {
            case 1 -> salaPrincipal.vender(entradas);
            case 2 -> zonaCompraVenta.vender(entradas);
            case 3 -> zonaVip.vender(entradas);
        }
    }

    private static int elegirOpcion(Scanner s, Zona salaPrincipal, Zona zonaCompraVenta, Zona zonaVip) {
        int opcion = s.nextInt();
        switch (opcion) {
            case 1:
                int n = salaPrincipal.getEntradasPorVender() +
                        zonaCompraVenta.getEntradasPorVender() +
                        zonaVip.getEntradasPorVender();
                System.out.println(n);
                break;
            case 2:
                System.out.printf("\n1. Sala Principal\n" +
                        "2. Zona Compra-Venta\n" +
                        "3. Zona VIP\n");
                System.out.println("¿Para qué zona quiere las entradas? ");
                int zona = s.nextInt();
                if (!(zona >= 1 && zona <= 3)) {
                    System.out.println("Lo lamento, esa zona no existe.");
                    return opcion;
                }
                System.out.println("¿Cuántas entradas quiere? ");
                int entradas = s.nextInt();
                vender(salaPrincipal, zonaCompraVenta, zonaVip, zona, entradas);
                break;
            case 3:
                System.out.print("Adiós, muchas gracias.");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        return opcion;
    }

    private static void printMenu() {
        System.out.printf("\n1. Mostrar número de entradas libres\n" +
                "2. Vender entradas\n" +
                "3. Salir\n");
        System.out.print("¿Qué desea? ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Zona salaPrincipal = new Zona(1000);
        Zona zonaCompraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);
        int opcion;
        do {
            printMenu();
            opcion = elegirOpcion(s, salaPrincipal, zonaCompraVenta, zonaVip);
        } while (opcion != 3);
        s.close();
    }
}
