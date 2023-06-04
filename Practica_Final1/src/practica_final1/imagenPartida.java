/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_final1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author 23Pauceta04
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

    @Override
    public Dimension getPreferredSize(){
        if(uib == null){
            return new Dimension (100,100);
            
        }else {
            return new Dimension (uib.getWidth(null),uib.getHeight(null));
        }
    
    }
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(uib, 0, 0, null);
        
    }
    
    
}

