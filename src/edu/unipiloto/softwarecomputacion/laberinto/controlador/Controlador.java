package edu.unipiloto.softwarecomputacion.laberinto.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import edu.unipiloto.softwarecomputacion.laberinto.modelo.LaberintoModelo;
import edu.unipiloto.softwarecomputacion.laberinto.vista.Vista;

public class Controlador{
	
	protected LaberintoModelo laberinto;
	protected Vista vista;
	
	public Controlador(){
		vista = new Vista();
		laberinto = new LaberintoModelo();
		int[][] obstaculos = laberinto.getObstaculos();
		int[][] resultado = laberinto.getResultado();
		//TODO
		//recorrer la vista y modificar
		vista.setMatrizObstaculos(obstaculos);
		vista.setMatrizResultado(resultado);
	}
	
	public static void main(String[] args) {
		new Controlador();
	}
	
}
