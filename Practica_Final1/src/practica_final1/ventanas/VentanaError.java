/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_final1.ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Pauceta
 */
public class VentanaError extends JFrame {

    private JLabel mensaje;
    private JButton ok;
    private JPanel panel;

    public VentanaError(String s) {
        mensaje = new JLabel();
        ok = new JButton();
        panel = new JPanel();
        setLayout(null);
        setSize(400, 150);
        setTitle("MENSAJE");
        setLocationRelativeTo(null);
        initComponents(s);
        this.setVisible(true);
    }
    private void initComponents(String s){
        panel.setBackground(Color.BLACK);
        panel.setSize(400, 150);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
        
        mensaje.setText(s);
        mensaje.setForeground(Color.YELLOW);
        mensaje.setFont(new Font("Courier",1,16));
        mensaje.setSize(500, 100);
        mensaje.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(mensaje);
        
        
        ok.setText("OK");
        ok.setFont(new Font("Courier",1,11));
        ok.setSize(50, 30);
        ok.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(ok);
        
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                dispose();
            }
        });
        
        this.getContentPane().add(panel);
        
        
        
        
        
    }
}
