package clases;

public class Terminal {
    private String numero;
    private int tiempoConversacion;

    public Terminal(String numero) {
        this.numero = numero;
    }

    public String getTerminal() {
        return this.numero;
    }

    public void setTerminal(String numero) {
        this.numero = numero;
    }

    public int getTiempoConversacion() {
        return this.tiempoConversacion;
    }

    public void llama(Terminal receptor, int minutos) {
        this.tiempoConversacion += minutos;
        receptor.tiempoConversacion += minutos;
    }

    @Override
    public String toString() {
        return "Nº " + this.getTerminal() + " - " + this.getTiempoConversacion() + "s de conversación";
    }
}
