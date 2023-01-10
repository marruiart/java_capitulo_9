package clases;

public class TarjetaRegalo {
    private double saldo;
    private String codigo;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        String zeroes = "";
        this.codigo = Integer.toString((int) (Math.random() * (99999 + 1)));
        int len = this.codigo.length();
        while (len++ < 5)
            zeroes += "0";
        this.codigo = zeroes.concat(this.codigo);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void gasta(double gasto) {
        if (this.saldo - gasto < 0)
            System.out.println("No tiene suficiente saldo para gastar " + gasto + "€");
        else
            this.saldo -= gasto;
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjetaAFusionar) {
        TarjetaRegalo tarjetaFusionada = new TarjetaRegalo(this.getSaldo() + tarjetaAFusionar.getSaldo());
        this.saldo = 0;
        tarjetaAFusionar.saldo = 0;
        return tarjetaFusionada;
    }

    @Override
    public String toString() {
        return String.format("Tarjeta nº %s – Saldo %.2f€", this.getCodigo(), this.getSaldo());
    }
}
