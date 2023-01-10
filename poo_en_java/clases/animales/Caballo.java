package clases.animales;

public class Caballo {

    public enum Sexo {
        MACHO, HEMBRA
    }
    public String nombre, capa, raza;
    public Sexo sexo;
    public String nacimiento;
    public int velocidad;
    public float peso;
    public void parar() {
        this.velocidad = 0;
    }
    public void irAlPaso() {
        this.velocidad = 6;
    }

    public void irAlTrote() {
        this.velocidad = 9;
    }

    public void irAlGalope() {
        this.velocidad = 12;
    }

    public void relincha() {
        System.out.println("hiii");
    }

    public Caballo(String nombre, String capa, String raza, Sexo sexo, String nacimiento, float peso) {
        this.nombre = nombre;
        this.capa = capa;
        this.raza = raza;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.peso = peso;
        this.velocidad = 0;
    }
}