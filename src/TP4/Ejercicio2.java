package TP4;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio2 extends JFrame {
	private JPanel contentPane; 
	private JTextField nota1, nota2, nota3;
	private JComboBox<String> comboTP;
	//private JLabel lblResultado;
	private JTextField txtPromedio, txtCondicion;
	
	
	public Ejercicio2() {
        setTitle("Promedio");
        setSize(400, 353);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        // Panel con borde titulado
        JPanel panelNotas = new JPanel(new GridBagLayout());
        panelNotas.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Notas del estudiante", 
                TitledBorder.LEFT, TitledBorder.TOP, 
                new Font("Tahoma", Font.BOLD, 14)));
        panelNotas.setBackground(Color.WHITE);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.anchor = GridBagConstraints.WEST;
        
        // Campos y etiquetas
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelNotas.add(new JLabel("Nota 1:"), gbc);

        gbc.gridy=1;
        panelNotas.add(new JLabel("Nota 2:"), gbc);

        gbc.gridy=2;
        panelNotas.add(new JLabel("Nota 3:"), gbc);

        gbc.gridy=3;
        panelNotas.add(new JLabel("TPS:"), gbc);
        
        // TextFields
        nota1 = new JTextField(10);
        nota2 = new JTextField(10);
        nota3 = new JTextField(10);
        comboTP = new JComboBox<>(new String[]{"Aprobado", "Desaprobado"});

        gbc.gridx = 1;
        gbc.gridy = 0;
        panelNotas.add(nota1, gbc);

        gbc.gridy=1;
        panelNotas.add(nota2, gbc);

        gbc.gridy=2;
        panelNotas.add(nota3, gbc);

        gbc.gridy=3;
        panelNotas.add(comboTP, gbc);

        // Panel de botones al lado derecho
        JPanel panelBotones = new JPanel(new GridLayout(3, 1, 10, 10));
        JButton btnCalcular = new JButton("CALCULAR");
        JButton btnNuevo = new JButton("NUEVO");
        JButton btnSalir = new JButton("SALIR");
        panelBotones.add(btnCalcular);
        panelBotones.add(btnNuevo);
        panelBotones.add(btnSalir);

        // Agregar todo al frame
        GridBagConstraints gbcMain = new GridBagConstraints();
        gbcMain.insets = new Insets(10, 10, 10, 10);
        gbcMain.gridx = 0;
        gbcMain.gridy = 0;
        add(panelNotas, gbcMain);

        gbcMain.gridx = 1;
        add(panelBotones, gbcMain);

        //aca el segundo panel
        JPanel panelResultado = new JPanel(new GridBagLayout());
        panelResultado.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Notas del estudiante",
                TitledBorder.LEFT, TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 14)));
        panelResultado.setBackground(Color.WHITE);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panelResultado.add(new JLabel("Promedio:"), gbc);
        gbc.gridy++;
        panelResultado.add(new JLabel("Condicion:"), gbc);

        txtPromedio = new JTextField(10);
        txtPromedio.setEditable(false);
        txtCondicion = new JTextField(10);
        txtCondicion.setEditable(false);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panelResultado.add(txtPromedio, gbc);
        gbc.gridy++;
        panelResultado.add(txtCondicion, gbc);

        gbcMain.gridx = 0;
        gbcMain.gridy = 1;
        gbcMain.gridwidth = 2;
        add(panelResultado, gbcMain);
        

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(nota1.getText());
                    double n2 = Double.parseDouble(nota2.getText());
                    double n3 = Double.parseDouble(nota3.getText());
                    String tp = comboTP.getSelectedItem().toString();
                    String condicion;
                    double promedio = (n1 + n2 + n3) / 3;

                    if (tp.equals("Desaprobado") || n1 < 6 || n2 < 6 || n3 < 6) {
                        condicion = "Libre";
                    } else if (n1 >= 8 && n2 >= 8 && n3 >= 8) {
                        condicion = "Promocionado";
                    } else {
                        condicion = "Regular";
                    }

                    // Mostramos los resultados en los campos de texto
                    txtPromedio.setText(String.format("%.2f", promedio));
                    txtCondicion.setText(condicion);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingresá valores numéricos válidos.");
                }
            }
        });
		
	}
		//accion boton nuevo
		//accion boton salir 
	
		public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new Ejercicio2().setVisible(true));
		}

}