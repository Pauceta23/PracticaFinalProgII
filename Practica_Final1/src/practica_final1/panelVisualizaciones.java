package practica_final1;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author 23Pauceta04
 */
public class panelVisualizaciones extends JPanel {

    public panelVisualizaciones() {

        this.setBackground(Color.black);
        this.add(new imagenPartida());
        this.setLayout(null);

    }
}
