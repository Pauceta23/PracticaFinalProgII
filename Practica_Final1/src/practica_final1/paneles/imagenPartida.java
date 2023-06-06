package practica_final1.paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Pau Belmonte && Enrique Grau
 */
public class imagenPartida extends JPanel{
    
    private String ImagenUIB = "imagenes/UIB.jpg";
    private BufferedImage uib;
    
    public imagenPartida(){
        try{
            uib =ImageIO.read(new File (ImagenUIB));
            this.setSize(1230,900);
        }catch (IOException e){

        }      
    }
    
    // Al parecer lo siguiente no hace falta:

//    @Override
//    public Dimension getPreferredSize(){
//        if(uib == null){
//            return new Dimension (100,100);
//            
//        }else {
//            return new Dimension (uib.getWidth(null),uib.getHeight(null));
//        }
//    
//    }
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(uib, 0, 0, null);
        
    }
    
    
}

