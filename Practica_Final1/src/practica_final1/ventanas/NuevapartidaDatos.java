package practica_final1.ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Pauceta
 */
public class NuevapartidaDatos extends JFrame {
    private JPanel panel;
    private JLabel nomjug;
    private JTextField intro_nomjug;
    private JLabel horsub;
    private JTextField intro_horsub;
    private JLabel versub;
    private JTextField intro_versub;
    private JButton confirmar;

//    private Object objJTextField;
    //Per controlar a quina caixa de text s'ha escrit usam aquest objecte
    public NuevapartidaDatos() {
        setSize(800, 125);
        setTitle("INTRODUCCIÓN DATOS");
        setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        panel = new JPanel();
        nomjug = new JLabel();
        intro_nomjug = new JTextField();
        horsub = new JLabel();
        intro_horsub = new JTextField();
        versub = new JLabel();
        intro_versub = new JTextField();
        confirmar = new JButton();

        panel.setLayout(new GridLayout(4, 2));
        panel.setBackground(Color.BLACK);

        
        Font font = new Font("Courier",1,16);
        nomjug.setFont(font);
        nomjug.setText("NOMBRE JUGADOR");
        nomjug.setForeground(Color.WHITE);
        panel.add(nomjug);

        //        intro_nomjug.setText("0.00");
        intro_nomjug.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(intro_nomjug);
        
        horsub.setFont(font);
        horsub.setText("NÚMERO SUBDIVISIONES HORIZONTAL");
        horsub.setForeground(Color.WHITE);
        panel.add(horsub);

        //        intro_horsub.setText("32.00");
        intro_horsub.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(intro_horsub);

        versub.setFont(font);
        versub.setText("NÚMERO SUBDIVISIONES VERTICAL");
        versub.setForeground(Color.WHITE);
        panel.add(versub);

//        intro_versub.setText("0.00");
        intro_versub.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(intro_versub);

        confirmar.setText("Acceptar");
        confirmar.setMnemonic('A');
        getRootPane().setDefaultButton(confirmar);//botó per omisió intro
        panel.add(confirmar);
        
        
        getContentPane().add(panel);

        //Per controlar els esdeveniments KeyEvent a les finestres de text
        KeyAdapter kl = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                jtfGrausKeyTyped(evt);
            }
        };
        intro_nomjug.addKeyListener(kl);
        intro_horsub.addKeyListener(kl);

        //Per controlar el click sobre Acceptar
        confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
    }


    private void jtfGrausKeyTyped(KeyEvent evt) {
//        objJTextField = evt.getSource(); //objecte que ha produit l'esdeveniment
    }

    private void confirmarActionPerformed(ActionEvent evt) {
        try {
            double gr;
            //Si el text s'ha escrit a la caixa de graus centigrads
//            if (objJTextField == intro_nomjug) {
//                gr = Double.parseDouble(intro_nomjug.getText()) * 9.0 / 5.0 + 32.0;
//                String s = String.format("%.2f", gr); //arrodoneix 2 decimals
//                intro_horsub.setText(s);
//            }
//            //Si s'ha escrit a la caixa de graus fahrenheit
//            if (objJTextField == intro_horsub) {
//                gr = (Double.parseDouble(intro_horsub.getText()) - 32.0) * 5.0 / 9.0;
//                String s = String.format("%.2f", gr);
//                intro_nomjug.setText(s);

        } catch (NumberFormatException e) {
            intro_nomjug.setText("0.00");
            intro_horsub.setText("32.00");
        }
    }
}
