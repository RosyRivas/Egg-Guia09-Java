
package modelo;

import java.util.ArrayList;


public class Baraja {
    private ArrayList<Carta> listaCarta;

    public Baraja() {
        this.listaCarta = new ArrayList();
    }

    public Baraja(ArrayList<Carta> listaCarta) {
        this.listaCarta = listaCarta;
    }

    public ArrayList<Carta> getListaCarta() {
        return listaCarta;
    }

    public void setListaCarta(ArrayList<Carta> listaCarta) {
        this.listaCarta = listaCarta;
    }
    
    
}
