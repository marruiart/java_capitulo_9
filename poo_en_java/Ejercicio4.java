/**
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
 * métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 *
 * @author: Marina Ruiz Artacho
 **/

import clases.Fraccion;

public class Ejercicio4 {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(10,5);
        Fraccion f2 = new Fraccion(25, 6);
        Fraccion f3 = new Fraccion(4, 8);
        Fraccion f1simple = f1.simplifica();
        Fraccion f3simple = f3.simplifica();
        System.out.printf("La fracción %s simplificada es %s\n", f1, f1simple);
        System.out.printf("La fracción %s simplificada es %s\n", f3, f3simple);
        System.out.printf("(%s) * (%s) = %s\n", f1, f2, f1.multiplica(f2).simplifica());
        System.out.printf("(%s) / (%s) = %s\n", f2, f3, f2.divide(f3).simplifica());
    }
}
