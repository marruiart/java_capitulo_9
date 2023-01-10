package clases.terminales;

public class Movil extends Terminal {
    private String tarifa;
    private float tarificados;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
    }

    @Override
    public void llama(Terminal receptor, int tiempo) {
        super.llama(receptor, tiempo);
        switch (tarifa) {
            case "rata" -> this.tarificados += (((float)tiempo/60) * 0.06);
            case "mono" -> this.tarificados += (((float)tiempo/60) * 0.12);
            case "bisonte" -> this.tarificados += (((float)tiempo/60) * 0.30);
        }
    }

    @Override
    public String toString() {
        return String.format("Nº %s - %ds de conversación - tarificados %.2f euros", this.getNumero(), this.getTiempoConversacion(), this.tarificados);
    }
}
