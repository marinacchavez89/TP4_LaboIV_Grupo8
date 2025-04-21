package TP4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {
	 private JPanel contentPane;

	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    Principal frame = new Principal();
	                    frame.setTitle("TP 4 - Menú Principal");
	                    frame.setSize(400, 300);
	                    frame.setLocationRelativeTo(null);
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }

	    public Principal() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 450, 300);

	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
	        contentPane.setLayout(new BorderLayout(0, 0));
	        setContentPane(contentPane);

	        // Acá se agregan el panel principal con los 3 botones
	        contentPane.add(new PantallaPrincipal(), BorderLayout.CENTER);
	    }
}
