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

    	// Título
        titulo = new JLabel("GRUPO NRO:  8", SwingConstants.LEFT);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.insets = new Insets(10, 10, 10, 10);
        gbcTitulo.gridx = 0;
        gbcTitulo.gridy = 0;
        add(titulo, gbcTitulo);

        // Botón Ejercicio 1
        btnEj1 = new JButton("Ejercicio 1");
        GridBagConstraints gbcBtn1 = new GridBagConstraints();
        gbcBtn1.insets = new Insets(10, 10, 10, 10);
        gbcBtn1.gridx = 0;
        gbcBtn1.gridy = 1;
        add(btnEj1, gbcBtn1);

        // Botón Ejercicio 2
        btnEj2 = new JButton("Ejercicio 2");
        GridBagConstraints gbcBtn2 = new GridBagConstraints();
        gbcBtn2.insets = new Insets(10, 10, 10, 10);
        gbcBtn2.gridx = 0;
        gbcBtn2.gridy = 2;
        add(btnEj2, gbcBtn2);

        // Botón Ejercicio 3
        btnEj3 = new JButton("Ejercicio 3");
        GridBagConstraints gbcBtn3 = new GridBagConstraints();
        gbcBtn3.insets = new Insets(10, 10, 10, 10);
        gbcBtn3.gridx = 0;
        gbcBtn3.gridy = 3;
        add(btnEj3, gbcBtn3);

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
