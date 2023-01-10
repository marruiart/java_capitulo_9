package Clases;

public class Coche extends Vehiculo {
    public String marca;
    public String modelo;
    public int kilometrosRecorridos;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrosRecorridos = 0;
    }

    // Métodos
    public void recorre(int kms) {
        this.setKilometrosTotales(this.getKilometrosRecorridos() + kms);
        kilometrosRecorridos += kms;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void quemarRueda() {
        System.out.println("brrrrrmmmm brrrrrmmmmmm");
    }
    @Override
    public String toString() {
        return String.format("%s %s Kilómetros recorridos: %d (Vehículos creados: %d, Kilómetros totales: %d)", this.marca, this.modelo, this.getKilometrosRecorridos(), getVehiculosCreados(), getKilometrosTotales());
    }
}
