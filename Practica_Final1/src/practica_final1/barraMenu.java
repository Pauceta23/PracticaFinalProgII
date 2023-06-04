/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_final1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author 23Pauceta04
 */
public class barraMenu extends JMenuBar {

    JMenu menu;
    JMenuItem it0;
    JMenuItem it1;
    JMenuItem it2;
    JMenuItem it3;
    JMenuItem it4;

    public barraMenu() {
        this.setBackground(Color.BLACK);
        initComponents();
    }

    private void initComponents() {
        menu = new JMenu("MENU");
        menu.setFont(new Font ("Courier", 1,20));
        menu.setForeground(Color.WHITE);

        it0 = new JMenuItem("NUEVA PARTIDA");
        it0.setBackground(Color.BLACK);
        it0.setForeground(Color.WHITE);
        
        
        
        
        it1 = new JMenuItem("CLASIFICACIÓN GENERAL");
        it1.setBackground(Color.BLACK);
        it1.setForeground(Color.WHITE);
        
        
        
        
        
        it2 = new JMenuItem("HISTORIAL");
        it2.setBackground(Color.BLACK);
        it2.setForeground(Color.WHITE);
        
        
        
        
        it3 = new JMenuItem("CAMBIAR DIRECTORIO DE IMÁGENES");
        it3.setBackground(Color.BLACK);
        it3.setForeground(Color.WHITE);
        
        
        
        
        it4 = new JMenuItem("SALIR");
        it4.setBackground(Color.BLACK);
        it4.setForeground(Color.WHITE);
        
        it4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                new panelBotones().salir();
            }
        });
        
        
        
        
        
        
        
        
        
        
        menu.add(it0);
        menu.add(it1);
        menu.add(it2);
        menu.add(it3);
        menu.add(it4);
        this.add(menu);
    }
}
