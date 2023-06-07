package practica_final1.main;

/**
 *
 * @author Pauceta
 */
public class DatosPartida {

    String nom;
    Integer subhor;
    Integer subver;

    public static class ErrorDatosInsuficientes extends Exception {
    }

    public DatosPartida(String n, String h, String v) throws ErrorDatosInsuficientes, NumberFormatException {
        nom = n;
        subhor = Integer.valueOf(h);
        subver = Integer.valueOf(v);

        if (nom.isBlank() || subhor == 0 || subver == 0) {
            throw new ErrorDatosInsuficientes();
        }

        System.out.println(n);
        System.out.println(subhor);
        System.out.println(subver);

    }

}
