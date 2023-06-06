package practica_final1.paneles;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Pau Belmonte && Enrique Grau
 */
public class PanelVisualizaciones extends JPanel {

    public PanelVisualizaciones() {

        this.setBackground(Color.black);
        this.add(new imagenPartida());
        this.setLayout(null);

    }
}
