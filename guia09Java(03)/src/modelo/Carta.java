
package modelo;


public class Carta {
    private int numeroCarta;
    private String palo;

    public Carta() {
    }

    public Carta(int numeroCarta, String palo) {
        this.numeroCarta = numeroCarta;
        this.palo = palo;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
   
    
}
