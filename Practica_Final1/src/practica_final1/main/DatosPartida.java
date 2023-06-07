/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_final1.main;

import practica_final1.ventanas.VentanaError;

/**
 *
 * @author Pauceta
 */
public class DatosPartida {

    String nom;
    Integer subhor;
    Integer subver;

    public DatosPartida(String n, String h, String v) throws ErrorDatosInsuficientes, NumberFormatException  {
        nom = n;
        subhor = Integer.valueOf(h);
        subver = Integer.valueOf(v);
        System.out.println(n);
        System.out.println(subhor);
        System.out.println(subver);
        
        if (nom.isBlank()) {
            throw new ErrorDatosInsuficientes();
        } else;
    }

    public static class ErrorDatosInsuficientes extends Exception {
        VentanaError error = new VentanaError("ERROR! Datos insuficientes");
    }

    private void comprobacion() throws ErrorDatosInsuficientes {
        
    }

}
