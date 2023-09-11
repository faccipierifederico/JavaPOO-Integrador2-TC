package Plantas;

public class Arbusto extends Planta{

    private double anchoArbusto;
    private boolean esDomestico;
    private String variedad;

    public Arbusto() {
    }

    public Arbusto(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, double anchoArbusto, boolean esDomestico, String variedad) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy un arbusto");
    }
}
