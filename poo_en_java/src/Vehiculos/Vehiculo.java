package Vehiculos;

abstract class Vehiculo {

    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    protected static void setKilometrosTotales(int km) {
        kilometrosTotales += km;
    }

    public void crearVehiculo() {
        vehiculosCreados += 1;
    }
}

