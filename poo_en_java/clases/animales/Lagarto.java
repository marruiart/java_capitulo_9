package clases.animales;

public class Lagarto extends Animal{
    public Lagarto () {
        this.dieta = "insectos";
    }

    public void tomarSol () {
        System.out.println("Solecitooooo");
    }

    public void correr () {
        System.out.println("Me voy corriendo!");
    }

    @Override
    public void acicalarse(){
        System.out.println("Soy de la sangre del dragón, yo no me acicalo");
    }
}
