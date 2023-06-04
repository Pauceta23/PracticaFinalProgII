/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_final1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 23Pauceta04
 */
public class panelBotones extends JPanel {

    JButton jbBoton0;
    JButton jbBoton1;
    JButton jbBoton2;
    JButton jbBoton3;

    public panelBotones() {

        jbBoton0 = new JButton();
        jbBoton1 = new JButton();
        jbBoton2 = new JButton();
        jbBoton3 = new JButton();
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(4,1));
        initComponents();
    }

    private void initComponents() {
            jbBoton0.setBackground(Color.BLACK);
            jbBoton0.setForeground(Color.WHITE);
            jbBoton0.setFont(new Font("Courier", 1, 20));
            jbBoton0.setText("NUEVA PARTIDA");
            
            jbBoton1.setBackground(Color.BLACK);
            jbBoton1.setForeground(Color.WHITE);
            jbBoton1.setFont(new Font("Courier", 1, 20));
            jbBoton1.setText("CLASIFICACIÓN GENERAL");
            
            jbBoton2.setBackground(Color.BLACK);
            jbBoton2.setForeground(Color.WHITE);
            jbBoton2.setFont(new Font("Courier", 1, 20));
            jbBoton2.setText("HISTORIAL");
            
            jbBoton3.setBackground(Color.BLACK);
            jbBoton3.setForeground(Color.WHITE);
            jbBoton3.setFont(new Font("Courier", 1, 20));
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
    
    
    
    public void salir(){
        System.exit(0);
    }
    
    public void nuevaPartida(){
        
    }
    
    public void clasGeneral(){
        
    }
    
    
    public void historial(){
        
    }
    
    
    }
