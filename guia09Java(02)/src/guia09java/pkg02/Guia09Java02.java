/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09java.pkg02;

import java.util.ArrayList;
import modelo.Juego;
import modelo.Jugador;
import modelo.Revolver;

/**
 *
 * @author Rosi-PC
 */
public class Guia09Java02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        Revolver revolver = new Revolver();
        jugadores = juego.listaJugadores();
        revolver.llenarRevolver();
        juego.llenarJuego(jugadores, revolver);
        juego.partida();
    }
    
}
