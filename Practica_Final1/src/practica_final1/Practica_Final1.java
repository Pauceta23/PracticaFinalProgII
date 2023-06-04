package practica_final1;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

/**
 *
 * @author 23Pauceta04
 */
public class Practica_Final1 extends JFrame {
    public Practica_Final1(){
        panelVisualizaciones pV = new panelVisualizaciones();       //Inicialización paneles
        barraMenu bm = new barraMenu();
        panelBotones pb = new panelBotones();
        
        
        this.setLayout(new BorderLayout());
        
        //Añadimos paneles a la ventana
        
        JSplitPane separador1 = new JSplitPane(SwingConstants.HORIZONTAL, bm, pV);
        this.getContentPane().add(separador1, BorderLayout.NORTH);
        
        JSplitPane separador2 = new JSplitPane(SwingConstants.VERTICAL, pb, pV);
        this.getContentPane().add(separador2);
        
        JSplitPane separador3 = new JSplitPane(SwingConstants.HORIZONTAL);
        this.getContentPane().add(separador3, BorderLayout.SOUTH);
        
    }
    
    public static void main(String[] args) {
        Practica_Final1 pf = new Practica_Final1();
        pf.setVisible(true);
        pf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pf.setSize(1520, 900);
        pf.setTitle("PRÁCTICA - PROGRAMACIÓN II - 2022-2023 - UIB");
        pf.setLocationRelativeTo(null);
        
        
    }
    
}
