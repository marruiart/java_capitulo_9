package Matematicas;

public class Fraccion {
    private int numerador;
    private int denominador;

    /* constructor */
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion invierte() {
        return new Fraccion(this.denominador, this.numerador);
    }

    private static int mcd (int a, int b) {
        return b == 0 ? a : mcd(b, a % b);
    }
    public String simplifica() {
        int mcd = mcd(this.numerador, this.denominador);
        this.numerador = this.numerador / mcd;
        this.denominador = this.denominador / mcd;
        return this.numerador + "/" + this.denominador;
    }

    public Fraccion multiplica(Fraccion f) {
        return new Fraccion(this.numerador * f.numerador, this.denominador * f.denominador);
    }

    public Fraccion divide(Fraccion f) {
        return new Fraccion(this.numerador * f.denominador, this.denominador * f.numerador);
    }

    @Override
    public String toString() {
        return (this.numerador + "/" + this.denominador);
    }
}