package Clases;

public class Caballo {
    public String nombre, capa, raza, sexo;
    public int edad;
    public int velocidad;
    public double peso;

    public void alPaso(){
        this.velocidad = 6;
    }

    public void alTrote(){
        this.velocidad = 9;
    }

    public void alGalope(){
        this.velocidad = 12;
    }

    public void relincha(){
        System.out.println("hiii");
    }

    public Caballo(String nombre, String capa, String raza, String sexo, int edad, double peso) {
        this.nombre = nombre;
        this.capa = capa;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.velocidad = 0;
    }
}