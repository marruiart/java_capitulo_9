package Clases;

public class Vehiculo {

    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    public int kilometrosRecorridos;

    public static int getKilometrosTotales(){
        return kilometrosTotales;
    }

    public void recorre(int km) {
        kilometrosTotales += km;
        kilometrosRecorridos += km;
    }

    Vehiculo() {
        this.kilometrosRecorridos = 0;
    }
}

