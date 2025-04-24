package TP4;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Ejercicio3 extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	public Ejercicio3() {
        setTitle("Seleccion multiple");
        setSize(464, 337);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        // Sistema Operativo
        JPanel panelSO = new JPanel();
        panelSO.setBounds(10, 28, 418, 45);
        panelSO.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelSO.setLayout(null);
        getContentPane().add(panelSO);

        // Label a la izquierda
        JLabel lblSO = new JLabel("Elije un sistema operativo");
        lblSO.setBounds(10, 10, 160, 20);
        panelSO.add(lblSO);

        // Radio buttons a la derecha
        JRadioButton rbWindows = new JRadioButton("Windows");
        rbWindows.setBounds(200, 10, 80, 20);
        panelSO.add(rbWindows);
        buttonGroup.add(rbWindows);

        JRadioButton rbMac = new JRadioButton("Mac");
        rbMac.setBounds(280, 10, 60, 20);
        panelSO.add(rbMac);
        buttonGroup.add(rbMac);

        JRadioButton rbLinux = new JRadioButton("Linux");
        rbLinux.setBounds(340, 10, 60, 20);
        panelSO.add(rbLinux);
        buttonGroup.add(rbLinux);
        
        /*// Especialidades --> No logré centrar correctamente el label en este bloque de código.
        JPanel panelEspecialidad = new JPanel();
        panelEspecialidad.setForeground(new Color(0, 0, 0));
        panelEspecialidad.setBounds(10, 80, 418, 120);
        panelEspecialidad.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        getContentPane().add(panelEspecialidad);

        GridBagLayout gbl_panelEspecialidad = new GridBagLayout();
        panelEspecialidad.setLayout(gbl_panelEspecialidad);

        // CheckBox: Programación - Separados en componentes para que no rompa por repetir nombre de variable con WindowsBuilder.
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(0, 0, 5, 0);
        gbc1.gridx = 6;
        gbc1.gridy = 0;
        gbc1.anchor = GridBagConstraints.WEST;
        JCheckBox cbProgramacion = new JCheckBox("Programación");
        panelEspecialidad.add(cbProgramacion, gbc1);
        
        // Label
        GridBagConstraints gbcLabel = new GridBagConstraints();
        gbcLabel.gridx = 0;
        gbcLabel.gridy = 1;
        gbcLabel.insets = new Insets(0, 0, 5, 5);
        JLabel lblEspecialidad = new JLabel("Elije una especialidad");
        panelEspecialidad.add(lblEspecialidad, gbcLabel);
        
        // CheckBox: Administración
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.insets = new Insets(0, 0, 5, 0);
        gbc2.gridx = 6;
        gbc2.gridy = 1;
        gbc2.anchor = GridBagConstraints.WEST;
        JCheckBox cbAdministracion = new JCheckBox("Administración");
        panelEspecialidad.add(cbAdministracion, gbc2);

        // CheckBox: Diseño Gráfico
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridx = 6;
        gbc3.gridy = 2;
        gbc3.anchor = GridBagConstraints.WEST;
        JCheckBox cbDisenio = new JCheckBox("Diseño Gráfico");
        panelEspecialidad.add(cbDisenio, gbc3);*/
        
        // Panel Especialidades
        JPanel panelEspecialidades = new JPanel();
        panelEspecialidades.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelEspecialidades.setBounds(10, 80, 418, 100);
        panelEspecialidades.setLayout(null);
        getContentPane().add(panelEspecialidades);

        // Label a la izquierda
        JLabel lblEspecialidad = new JLabel("Elije una especialidad");
        lblEspecialidad.setBounds(10, 35, 150, 20);
        panelEspecialidades.add(lblEspecialidad);

        // Checkboxes a la derecha
        JCheckBox cbProgramacion = new JCheckBox("Programación");
        cbProgramacion.setBounds(200, 10, 150, 20);
        panelEspecialidades.add(cbProgramacion);

        JCheckBox cbAdministracion = new JCheckBox("Administración");
        cbAdministracion.setBounds(200, 35, 150, 20);
        panelEspecialidades.add(cbAdministracion);

        JCheckBox cbDisenio = new JCheckBox("Diseño Gráfico");
        cbDisenio.setBounds(200, 60, 150, 20);
        panelEspecialidades.add(cbDisenio);

        
        // Cantidad de horas
        JLabel lblCantHoras = new JLabel("Cantidad de horas en el computador:");
        lblCantHoras.setBounds(20, 221, 220, 14);
        getContentPane().add(lblCantHoras);
        
        textField = new JTextField();
        textField.setBounds(251, 218, 177, 20);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(339, 264, 89, 23);
        getContentPane().add(btnAceptar);
        
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores seleccionados
                String soSeleccionado = getSOSeleccionado();
                String especialidadesSeleccionadas = getEspecialidadesSeleccionadas();
                String horasComputadora = textField.getText();
                
                if(horasComputadora.isEmpty()) {
                	JOptionPane.showMessageDialog(
                			Ejercicio3.this,
                			"Por favor, ingrese la cantidad de horas.",
                			"Campo vacío",
                			JOptionPane.WARNING_MESSAGE
                			);
                	return;
                }

                // Mostrar los datos en una nueva ventana
                mostrarMensajeFormateado(soSeleccionado, especialidadesSeleccionadas, horasComputadora);
            }

            // Obtenemos el SO seleccionado
            private String getSOSeleccionado() {
                if (rbWindows.isSelected()) {
                    return "Windows";
                } else if (rbMac.isSelected()) {
                    return "Mac";
                } else if (rbLinux.isSelected()) {
                    return "Linux";
                }
                return "";
            }

            // Concateno el string de de las especialidades seleccionadas
            private String getEspecialidadesSeleccionadas() {
                StringBuilder sb = new StringBuilder();
                if (cbProgramacion.isSelected()) {
                    sb.append("Programación - ");
                }
                if (cbAdministracion.isSelected()) {
                    sb.append("Administración - ");
                }
                if (cbDisenio.isSelected()) {
                    sb.append("Diseño Gráfico - ");
                }
                // Eliminar el último "-" si hay una sola especialidad seleccionada.
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 3, sb.length());
                }
                return sb.toString();
            }

            // Método para mostrar los datos seleccionados en una ventana con el formato deseado
            private void mostrarMensajeFormateado(String so, String especialidades, String horas) {
                JOptionPane.showMessageDialog(
                        Ejercicio3.this, // Uso la misma instancia de la ventana
                        so + (especialidades.isEmpty() ? "" : " - " + especialidades) + (horas.isEmpty() ? "" : " - " + horas + " Hs"),
                        "Mensaje",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }
}