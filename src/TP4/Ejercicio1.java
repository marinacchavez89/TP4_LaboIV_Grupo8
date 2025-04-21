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
        setSize(564, 430);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(57, 39, 46, 14);
        getContentPane().add(lblNombre);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(139, 36, 197, 20);
        getContentPane().add(txtNombre);
        txtNombre.setColumns(10);
        
        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(57, 82, 46, 14);
        getContentPane().add(lblApellido);
        
        txtApellido = new JTextField();
        txtApellido.setBounds(139, 79, 197, 20);
        getContentPane().add(txtApellido);
        txtApellido.setColumns(10);
        
        JLabel lblTelefono = new JLabel("Telefono");
        lblTelefono.setBounds(57, 129, 75, 14);
        getContentPane().add(lblTelefono);
        
        txtTelefono = new JTextField();
        txtTelefono.setBounds(139, 126, 197, 20);
        getContentPane().add(txtTelefono);
        txtTelefono.setColumns(10);
        
        JLabel lblFecha = new JLabel("Fecha Nac.");
        lblFecha.setBounds(57, 184, 75, 14);
        getContentPane().add(lblFecha);
        
        txtFecha = new JTextField();
        txtFecha.setBounds(139, 181, 197, 20);
        getContentPane().add(txtFecha);
        txtFecha.setColumns(10);
        
        JLabel lblMostrar = new JLabel("Los datos ingresados fueron:");
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
        		 
        		 mensaje = " " + txtNombre.getText() + " " + txtApellido.getText() + " " +txtTelefono.getText() + " " + txtFecha.getText();
        		 lblMostrarCampos.setText(mensaje);
        		 
        		 txtNombre.setText("");
        		 txtApellido.setText("");
        		 txtTelefono.setText("");
        		 txtNombre.setText("");
        		 txtFecha.setText("");
        		 
        		 txtNombre.setBackground(Color.WHITE);
     		     txtApellido.setBackground(Color.WHITE);
     			 txtTelefono.setBackground(Color.WHITE);
     			 txtFecha.setBackground(Color.WHITE);
        	 }
        		       		
        	}
        });
        
        btnMostrar.setBounds(234, 233, 89, 23);
        getContentPane().add(btnMostrar);
        
    }
}
