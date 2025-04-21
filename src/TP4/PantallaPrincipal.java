package TP4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PantallaPrincipal extends JPanel {
	
	private JButton btnEj1;
	private JButton btnEj2;
	private JButton btnEj3;
	private JLabel titulo;

    public PantallaPrincipal() {
    	setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        titulo = new JLabel("GRUPO NRO:  8", SwingConstants.LEFT);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(titulo, gbc);

        btnEj1 = new JButton("Ejercicio 1");
        gbc.gridy = 1;
        add(btnEj1, gbc);

        btnEj2 = new JButton("Ejercicio 2");
        gbc.gridy = 2;
        add(btnEj2, gbc);

        btnEj3 = new JButton("Ejercicio 3");
        gbc.gridy = 3;
        add(btnEj3, gbc);

        // Eventos
        btnEj1.addActionListener(new EventoEj1());
        btnEj2.addActionListener(new EventoEj2());
        btnEj3.addActionListener(new EventoEj3());
    }

    // Clase interna para evento Ejercicio 1
    class EventoEj1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Ejercicio1 ej1 = new Ejercicio1();
            ej1.setVisible(true);
        }
    }

    // Clase interna para evento Ejercicio 2
    class EventoEj2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Ejercicio2 ej2 = new Ejercicio2();
            ej2.setVisible(true);
        }
    }

    // Clase interna para evento Ejercicio 3
    class EventoEj3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Ejercicio3 ej3 = new Ejercicio3();
            ej3.setVisible(true);
        }
    }
}
