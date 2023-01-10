package Clases;

public class Pinguino extends Ave {
    public Pinguino() {
        this.dieta = "carne";
    }

    public void graznar() {
        System.out.println("wa, wa, wa, waaaaa");
    }

    @Override
    public void volar() {
        System.out.println("No puedo volar...");
    }

    public void nadar() {
        System.out.println("Nadando voy, nadando vengo");
    }
}
