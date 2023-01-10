package clases.animales;

public class Gato extends Mamifero{
    public Gato (Boolean esCachorro) {
        super(esCachorro);
        this.dieta = "carne";
    }

    public void maullar () {
        System.out.println("miauuuu");
    }
}
