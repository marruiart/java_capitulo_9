package clases;

import enums.Enums;

public class Pizza {
    private final Enums.Tamano tamano;
    private final Enums.Tipo tipo;
    private Enums.Estado estado;
    private static int totalServidas;
    private static int totalPedidas;

    public Pizza(Enums.Tipo tipo, Enums.Tamano tamano) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.estado = Enums.Estado.PEDIDA;
        totalPedidas++;
    }

    public String getTamano() {
        return this.tamano.toString().toLowerCase();
    }

    public String getTipo() {
        return this.tipo.toString().toLowerCase().replace("_", " ");
    }

    public String getEstado() {
        return this.estado.toString().toLowerCase();
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public void sirve() {
        if (this.estado == Enums.Estado.SERVIDA)
            System.out.println("esa pizza ya se ha servido");
        this.estado = Enums.Estado.SERVIDA;
        totalServidas++;
    }

    @Override
    public String toString() {
        return String.format("pizza %s %s, %s", getTipo(), getTamano(), getEstado());
    }
}
