package Plantas;

public class Flor extends Planta{

    private String colorPetalos;
    private int cantPetalos;
    private String colorPistilo;

    public Flor() {
    }

    public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos, int cantPetalos, String colorPistilo) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistilo = colorPistilo;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy una flor");
    }
}
