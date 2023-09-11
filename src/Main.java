import Plantas.Arbol;
import Plantas.Arbusto;
import Plantas.Flor;

public class Main {

    public static void main(String[] args) {

        Arbol arbol = new Arbol();
        Flor flor = new Flor();
        Arbusto arbusto = new Arbusto();

        arbol.decirLoQueSoy();
        flor.decirLoQueSoy();
        arbusto.decirLoQueSoy();


    }
}