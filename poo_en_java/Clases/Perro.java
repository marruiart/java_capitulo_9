package Clases;

public class Perro extends Mamifero{
    public Perro (Boolean esCachorro) {
        super(esCachorro);
        this.dieta = "pienso";
    }

    public void ladrar () {
        System.out.println("guau guau!");
    }
}
