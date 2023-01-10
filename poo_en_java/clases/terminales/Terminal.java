package clases.terminales;

public class Terminal {
    private final String numero;
    private int tiempoConversacion;

    public Terminal(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public int getTiempoConversacion() {
        return this.tiempoConversacion;
    }

    public void llama(Terminal receptor, int tiempo) {
        this.tiempoConversacion += tiempo;
        receptor.tiempoConversacion += tiempo;
    }

    @Override
    public String toString() {
        return "Nº " + this.getNumero() + " - " + this.getTiempoConversacion() + "s de conversación";
    }
}
