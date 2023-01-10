package clases.vehiculos;

import enums.Enums;

public class Bicicleta extends Vehiculo {
    public Enums.TipoBici tipo;
    public int kilometrosRecorridos;


    // Constructor
    public Bicicleta(Enums.TipoBici tipo) {
        super();
        this.tipo = tipo;
        this.kilometrosRecorridos = 0;
    }

    // Métodos
    public void recorre(int kms) {
        this.setKilometrosTotales(this.getKilometrosRecorridos() + kms);
        this.kilometrosRecorridos += kms;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public void hacerCaballito() {
        System.out.println("    ~~O");
        System.out.println("  -  /\\,");
        System.out.println(" -  -|~(*)");
        System.out.println("-  (*)");
        System.out.println("^^^___________");
    }

    @Override
    public String toString() {
        return String.format("Bicicleta %s Kilómetros recorridos: %d (Vehículos creados: %d, Kilómetros totales: %d)", this.tipo, this.getKilometrosRecorridos(), getVehiculosCreados(), getKilometrosTotales());
    }

}
