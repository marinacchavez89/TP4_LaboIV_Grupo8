package TP4;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ejercicio3 extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public Ejercicio3() {
        setTitle("Seleccion multiple");
        setSize(454, 298);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBounds(10, 28, 418, 35);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        getContentPane().add(panel);
        FlowLayout fl_panel = new FlowLayout(FlowLayout.CENTER, 5, 5);
        fl_panel.setAlignOnBaseline(true);
        panel.setLayout(fl_panel);
        
        JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
        panel.add(lblNewLabel);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
        buttonGroup.add(rdbtnNewRadioButton);
        rdbtnNewRadioButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        panel.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("MAC");
        buttonGroup.add(rdbtnNewRadioButton_1);
        rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        panel.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Linux");
        buttonGroup.add(rdbtnNewRadioButton_2);
        panel.add(rdbtnNewRadioButton_2);
       
    }
}