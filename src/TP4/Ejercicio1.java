package TP4;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFecha;
	private String mensaje;
	public Ejercicio1() {
        setTitle("Contactos");
        setSize(508, 411);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(91, 59, 46, 14);
        getContentPane().add(lblNombre);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(218, 53, 197, 20);
        getContentPane().add(txtNombre);
        txtNombre.setColumns(10);
        
        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(91, 104, 46, 14);
        getContentPane().add(lblApellido);
        
        txtApellido = new JTextField();
        txtApellido.setBounds(218, 98, 197, 20);
        getContentPane().add(txtApellido);
        txtApellido.setColumns(10);
        
        JLabel lblTelefono = new JLabel("Telefono");
        lblTelefono.setBounds(91, 144, 75, 14);
        getContentPane().add(lblTelefono);
        
        txtTelefono = new JTextField();
        txtTelefono.setBounds(218, 138, 197, 20);
        getContentPane().add(txtTelefono);
        txtTelefono.setColumns(10);
        
        JLabel lblFecha = new JLabel("Fecha Nac.");
        lblFecha.setBounds(91, 184, 75, 14);
        getContentPane().add(lblFecha);
        
        txtFecha = new JTextField();
        txtFecha.setBounds(218, 178, 197, 20);
        getContentPane().add(txtFecha);
        txtFecha.setColumns(10);
        
        //JLabel lblMostrar = new JLabel("Los datos ingresados fueron:");
        JLabel lblMostrar = new JLabel("");
        lblMostrar.setBounds(10, 325, 172, 14);
        getContentPane().add(lblMostrar);
               
        JLabel lblMostrarCampos = new JLabel("");
        lblMostrarCampos.setBounds(192, 325, 346, 14);
        getContentPane().add(lblMostrarCampos);
        
        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	 boolean completo = true;
        	 
        	 if(txtNombre.getText().trim().isEmpty()) {
        		 txtNombre.setBackground(Color.RED);
        		 completo = false;
        	 } else {
        		 txtNombre.setBackground(Color.WHITE);
        	 }
        	 
        	 if(txtApellido.getText().trim().isEmpty()) {
        		 txtApellido.setBackground(Color.RED);
        	 	 completo = false;
        	 } else {
        		 txtApellido.setBackground(Color.WHITE);
        	 }
        	 
        	 if(txtTelefono.getText().trim().isEmpty()) {
        		 txtTelefono.setBackground(Color.RED);
        	 	 completo = false;
        	 } else {
        		 txtTelefono.setBackground(Color.WHITE);
        	 }
        	 
        	 if(txtFecha.getText().trim().isEmpty()) {
        		 txtFecha.setBackground(Color.RED);
        	 	 completo = false;
        	 } else {
        		 txtFecha.setBackground(Color.WHITE);
        	 }
        	 
        	 if(completo) {
        		 
        	     /* //validar que se ingresen letras en nombre 
                 if (!txtNombre.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        	          txtNombre.setBackground(Color.RED);
        		      JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras.");
        		      return;
        		    }

                 //validar que se ingresen letras en apellido
        	     if (!txtApellido.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        		      txtApellido.setBackground(Color.RED);
        		      JOptionPane.showMessageDialog(null, "El apellido solo debe contener letras.");
        		      return;
        		    }

        		 // Validar que se ingresen numeros en telefono 
        		 if (!txtTelefono.getText().matches("\\d+")) {
        		      txtTelefono.setBackground(Color.RED);
        		      JOptionPane.showMessageDialog(null, "El teléfono solo debe contener números.");
        		      return;
        		   }    */
        		 
        		//ahora se setea solo si esta todo completo
        		lblMostrar.setText("Los datos ingresados fueron:"); 
        		 
        		 mensaje = " " + txtNombre.getText() + " " + txtApellido.getText() + " " +txtTelefono.getText() + " " + txtFecha.getText();
        		 
        		 lblMostrarCampos.setText(mensaje);
        		 
        		 JOptionPane.showMessageDialog(null, "Datos mostrados correctamente.");
        		 
        		 txtNombre.setText("");
        		 txtApellido.setText("");
        		 txtTelefono.setText("");        		 
        		 txtFecha.setText("");        		 
        		 
        		 txtNombre.setBackground(Color.WHITE);
     		     txtApellido.setBackground(Color.WHITE);
     			 txtTelefono.setBackground(Color.WHITE);
     			 txtFecha.setBackground(Color.WHITE);
        	 } else {
        			//se muestra este texto si hay campos vacios
        			lblMostrar.setText("No hay campos para mostrar");
        			lblMostrarCampos.setText("");        		       		
        	 }
			}
		});
        
        btnMostrar.setBounds(326, 233, 89, 23);
        getContentPane().add(btnMostrar);
        
    }
}
