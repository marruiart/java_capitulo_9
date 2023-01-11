package clases;

public class Tiempo implements Cloneable {
    private final int segundos;

    private int getSegundos() {
        return this.segundos;
    }

    public Tiempo() {
        this.segundos = 0;
    }

    public Tiempo(int segundos) {
        this.segundos = segundos;
    }

    public Tiempo(int h, int m, int s) {
        this.segundos = h * 3600 + m * 60 + s;
    }

    public Tiempo(Tiempo t) {
        this(t.getSegundos());
    }

    @Override
    protected Tiempo clone() {
        return new Tiempo(this.getSegundos());
    }

    private int getHorasEnTiempo() {
        return Math.abs(this.segundos / 3600);
    }

    private int getMinutosEnTiempo() {
        return Math.abs(this.segundos % 3600 / 60);
    }

    private int getSegundosEnTiempo() {
        return Math.abs(this.segundos % 3600 % 60);
    }

    public Tiempo suma(Tiempo t) {
        return new Tiempo(this.segundos + t.getSegundos());
    }

    public Tiempo resta(Tiempo t) {
        return new Tiempo(this.segundos - t.getSegundos());
    }

    @Override
    public String toString() {
        return ((this.segundos < 0) ? "-(" : "") +
                this.getHorasEnTiempo() + "h " +
                this.getMinutosEnTiempo() + "m " +
                this.getSegundosEnTiempo() + "s" +
                ((this.segundos < 0) ? ")" : "");
    }
}