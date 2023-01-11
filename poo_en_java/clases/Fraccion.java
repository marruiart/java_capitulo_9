package clases;

public class Fraccion implements Cloneable {
    private int numerador;
    private int denominador;

    public int getNumerador() {
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    // Constructor sin parámetros
    private Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    // Constructor con parámetros
    public Fraccion(int num, int den) {
        this();
        if (den == 0)
            System.out.println("Fracción no permitida");
        else {
            this.numerador = num;
            this.denominador = den;
        }
    }

    // Constructor de copia
    public Fraccion(Fraccion f) {
        this(f.getNumerador(), f.getDenominador());
    }

    // Clonar fracción
    public Fraccion clone() {
        return new Fraccion(this.numerador, this.denominador);
    }

    // Métodos
    public Fraccion invierte() {

        return new Fraccion(this.denominador, this.numerador);
    }

    public Fraccion multiplica(Fraccion f) {
        return new Fraccion(this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
    }

    public Fraccion multiplica(int n) {
        return multiplica(new Fraccion(n, 1));
    }

    public Fraccion divide(Fraccion f) {
        return this.multiplica(f.invierte());
    }

    public Fraccion divide(int n) {
        return this.divide(new Fraccion(n, 1));
    }

    public Fraccion simplifica() {
        int num = this.numerador;
        int den = this.denominador;
        int min = Math.min(num, den);
        for (int i = 2; i <= Math.abs(min); i++) {
            if (num % Math.abs(i) == 0 && den % Math.abs(i) == 0) {
                num /= i;
                den /= i;
                min = Math.min(num, den);
            }
        }
        return new Fraccion(num, den);
    }

    @Override
    public String toString() {
        boolean neg = (this.numerador < 0 || this.denominador < 0) && !(this.numerador < 0 && this.denominador < 0);
        return (neg ? "-" : "" + Math.abs(this.numerador) + "/" + Math.abs(this.denominador));
    }
}
