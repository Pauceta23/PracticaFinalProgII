package practica_final1.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Pau Belmonte && Enrique Grau
 */
public class PanelBotones extends JPanel {

    JButton jbBoton0;
    JButton jbBoton1;
    JButton jbBoton2;
    JButton jbBoton3;

    public PanelBotones() {

        jbBoton0 = new JButton();
        jbBoton1 = new JButton();
        jbBoton2 = new JButton();
        jbBoton3 = new JButton();
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(4,1));
        initComponents();
    }

    private void initComponents() {
        Font font = new Font("Courier",1,20);
        
            jbBoton0.setBackground(Color.BLACK);
            jbBoton0.setForeground(Color.WHITE);
            jbBoton0.setFont(font);
            jbBoton0.setText("NUEVA PARTIDA");
            jbBoton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                
                
            }
        });
            
            jbBoton1.setBackground(Color.BLACK);
            jbBoton1.setForeground(Color.WHITE);
            jbBoton1.setFont(font);
            jbBoton1.setText("CLASIFICACIÓN GENERAL");
            jbBoton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {

            }
        });
            
            jbBoton2.setBackground(Color.BLACK);
            jbBoton2.setForeground(Color.WHITE);
            jbBoton2.setFont(font);
            jbBoton2.setText("HISTORIAL");
            jbBoton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                

            }
        });
            
            jbBoton3.setBackground(Color.BLACK);
            jbBoton3.setForeground(Color.WHITE);
            jbBoton3.setFont(font);
            jbBoton3.setText("SALIR");
            jbBoton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                salir();

            }
        });
            
            this.add(jbBoton0);
            this.add(jbBoton1);
            this.add(jbBoton2);
            this.add(jbBoton3);
        }
    
    
    
    public void nuevaPartida(){
        
    }
    
    public void clasGeneral(){
        
    }
    
    
    public void historial(){
        
    }
    
    public void salir(){
        System.exit(0);
    }
    
    
    }
