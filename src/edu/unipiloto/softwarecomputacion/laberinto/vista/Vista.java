package edu.unipiloto.softwarecomputacion.laberinto.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Vista extends JFrame{
	
	JButton buttons[][] = new JButton[10][10]; 
	
	public Vista(){
		super("Torres de Hanoi");
		this.setLayout(new GridBagLayout());
		iniciarVista();
		setSize(700, 500);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private void iniciarVista() {
		GridBagConstraints gbc = new GridBagConstraints();
		
		//TODO agregar botones
		for (int i=0 ; i<10 ; i++){
			for(int j=0 ; j<10 ; j++){
				buttons[i][j] = 
				
				gbc.gridx = j;
				gbc.gridy = i;
				gbc.fill = GridBagConstraints.HORIZONTAL;
				
				add(buttons[i][j],gbc);
			}
		}
	}

	public void setMatrizResultado(int[][] resultado) {
		//TODO agregar color botones
		for (int i=0 ; i<10 ; i++){
			for(int j=0 ; j<10 ; j++){
				if(resultado[i][j]==1)
				buttons[i][j].setBackground(Color.RED); 
			}
		}
	}
	
}
