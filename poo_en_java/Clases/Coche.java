package Clases;

public class Coche extends Vehiculo {
    public String marca;
    public String modelo;
    public int kilometrosRecorridos;

    // Métodos
    public void recorre(int km) {
        setKilometrosTotales(km);
        kilometrosRecorridos += km;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void quemarRueda() {
        System.out.println("brrrrrmmmm brrrrrmmmmmm");
    }

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrosRecorridos = 0;

        crearVehiculo();
    }
}
