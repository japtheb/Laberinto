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
	
	JTextField fields[][] = new JTextField[10][10]; 
	
	public Vista(){
		super("Laberinto");
		this.setLayout(new GridBagLayout());
		iniciarVista();
		setSize(500, 500);
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
				fields[i][j] = new JTextField();
				fields[i][j].setEditable(false);
				fields[i][j].setHorizontalAlignment(JTextField.CENTER);
				gbc.gridx = j;
				gbc.gridy = i;
				gbc.weighty = 1;
				gbc.weightx = 1;
				gbc.fill = GridBagConstraints.HORIZONTAL;
				
				add(fields[i][j],gbc);
			}
		}
	}

	public void setMatrizResultado(int[][] resultado) {
		//TODO agregar color botones
		for (int i=0 ; i<10 ; i++){
			for(int j=0 ; j<10 ; j++){
				if(resultado[i][j]==1){
					fields[i][j].setBackground(Color.RED);
					fields[i][j].setOpaque(true);
				}
			}
		}
	}

	public void setMatrizObstaculos(int[][] obstaculos) {
		for (int i=0 ; i<10 ; i++){
			for(int j=0 ; j<10 ; j++){
				if(obstaculos[i][j]==1){
					fields[i][j].setText("1"); 
				}
			}
		}
	}
	
}
