package clases.animales;

public abstract class Animal {
    protected String dieta;

    public String comer(String comida) {
        String respuesta;
        if (comida.equals(this.dieta))
            respuesta = "me encanta comer " + comida;
        else
            respuesta = "puaj! esa no es mi dieta";
        return respuesta;
    }

    public void acicalarse(){
        System.out.println("Me estoy acicalando");
    }
}
