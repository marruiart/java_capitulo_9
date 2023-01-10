package Clases;

public abstract class Vehiculo {
    private static int vehiculosCreados;
    private static int kilometrosTotales;

    Vehiculo () {
        vehiculosCreados++;
        kilometrosTotales = 0;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    protected static void setKilometrosTotales(int kms) {
        kilometrosTotales = kms;
    }
}

