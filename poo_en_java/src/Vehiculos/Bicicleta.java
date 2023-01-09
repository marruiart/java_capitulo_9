package Vehiculos;

public class Bicicleta extends Vehiculo {

    public enum TipoBici {
        URBANA, MOUNTAIN, PASEO, CARRETERA, BMX
    }

    public TipoBici tipo;
    public int kilometrosRecorridos;
    private static Bicicleta[] bicicletas;


    // Métodos
    public void recorre(int km) {
        setKilometrosTotales(km);
        kilometrosRecorridos += km;
    }

    public int getKilometrosRecorridos () {
        return kilometrosRecorridos;
    }

    public void hacerCaballito() {
        System.out.println("    ~~O");
        System.out.println("  -  /\\,");
        System.out.println(" -  -|~(*)");
        System.out.println("-  (*)");
        System.out.println("^^^___________");
    }

    // Constructor
    public Bicicleta(TipoBici tipo) {
        this.tipo = tipo;
        this.kilometrosRecorridos = 0;

        crearVehiculo();
    }

}
