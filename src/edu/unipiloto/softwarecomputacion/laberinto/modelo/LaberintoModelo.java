package edu.unipiloto.softwarecomputacion.laberinto.modelo;

public class LaberintoModelo {

	protected int matriz[][];
	protected int resultado[][];
	protected int numFilas;
	protected int numColumnas;

	public LaberintoModelo(int numFilas, int numColumnas){
		this.numFilas = numFilas>0?numFilas:10;
		this.numColumnas = numColumnas>0?numColumnas:10;
		this.matriz = new int[numColumnas][numFilas];
	}
		
	public int[][] getMatriz() {
		return matriz;
	}

	public int getNumFilas() {
		return numFilas;
	}

	public int getNumColumnas() {
		return numColumnas;
	}

	public int[][] getResultado() {
		return resultado;
	}
}
