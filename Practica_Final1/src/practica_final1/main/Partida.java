package practica_final1.main;

import java.util.Date;

/**
 *
 * @author Pauceta
 */
public class Partida {

    String nombrejugador;
    int puntos;
    String fecha;

    public Partida(String nom, int pts) {
        nombrejugador = nom;
        puntos = pts;
        fecha = new Date().toString();
    }
    
    @Override
    public String toString(){
        String s = "JUGADOR: " + nombrejugador + "FECHA: " + fecha + "PUNTOS: " + puntos;
        return s;
    }
}
