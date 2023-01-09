package Clases;

public class Tiempo {
    int horas;
    int min;
    int seg;

    public Tiempo(int horas, int min, int seg) {
        this.horas = horas;
        this.min = min;
        this.seg = seg;
    }

    public Tiempo suma(Tiempo t) {
        int h, m, s;
        int totalSeg = this.seg + t.seg;
        int totalMin = this.min + t.min + ((totalSeg % 59 == 0) ? 0 : 1);
        s = (totalSeg > 59) ? totalSeg % 60 : totalSeg;
        m = (totalMin > 59) ? totalMin % 60 : totalMin;
        h = this.horas + t.horas + ((totalMin % 59 == 0) ? 0 : 1);
        return new Tiempo(h, m, s);
    }

    public Tiempo resta(Tiempo t) {
        int h, m, s;
        int totalHoras = this.horas - t.horas;
        if (totalHoras < 0)
            return new Tiempo(0, 0, 0);
        int totalSeg = this.seg - t.seg;
        int totalMin = this.min - t.min - ((totalSeg < 0) ? 1 : 0);
        s = (totalSeg < 0) ? 60 - (-totalSeg) : totalSeg;
        m = (totalMin < 0) ? 60 - (-totalMin) : totalMin;
        h = totalHoras - ((totalMin < 0) ? 1 : 0);
        return new Tiempo(h, m, s);
    }

    @Override
    public String toString() {
        return this.horas + "h " + this.min + "m " + this.seg + "s";
    }
}