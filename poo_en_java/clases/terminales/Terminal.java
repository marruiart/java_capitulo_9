package clases.terminales;

public class Terminal {
    private String numero;
    private int tiempoConversacion;

    private Terminal() {
        this.numero = "123 45 67 89";
        this.tiempoConversacion = 0;
    }

    public Terminal(String numero) {
        this();
        if (numero.length() > 0) {
            this.numero = numero;
        }
        this.tiempoConversacion = 0;
    }

    public String getNumero() {
        return this.numero;
    }

    public int getTiempoConversacion() {
        return this.tiempoConversacion;
    }

    public void tiempoEnLlamada(int tiempo) {
        this.tiempoConversacion += tiempo;
    }

    public void llama(Terminal receptor, int tiempo) {
        this.tiempoEnLlamada(tiempo);
    }

    public void recibe(Terminal receptor, int tiempo) {
        this.tiempoEnLlamada(tiempo);
    }

    @Override
    public String toString() {
        return "Nº " + this.getNumero() + " - " + this.getTiempoConversacion() + "s de conversación";
    }
}
