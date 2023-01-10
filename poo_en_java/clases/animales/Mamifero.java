package clases.animales;

public abstract class Mamifero extends Animal {
    protected Boolean esCachorro;
    public Mamifero(Boolean esCachorro) {
        this.esCachorro = esCachorro;
    }

    public Boolean getEsCachorro() {
        return this.esCachorro;
    }

    @Override
    public String comer(String comida) {
        if (comida.equals(this.dieta))
            return String.format("me encanta comer %s", comida);
        else if (comida.equals("leche") && this.esCachorro)
            return String.format("me gusta la leche");
        else
            return String.format("puaj! esa no es mi dieta");
    }

    public void correr() {
        System.out.println("Corriendo como el viento");
    }
}
