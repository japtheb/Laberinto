package edu.unipiloto.softwarecomputacion.laberinto.modelo;

import java.util.Random;

public class LaberintoModelo {

	protected int obstaculos[][];
	protected int resultado[][];
	private boolean haySolucion;

	public LaberintoModelo(){
		this.obstaculos = new int[10][10];
		this.resultado = new int[10][10];
		for(int i = 0; i < 10 ; i++){
			for(int j = 0; j < 10 ; j++){
				obstaculos[i][j] = 0;
				resultado[i][j] = 0;
			}
		}
		int numObstaculos = new Random().nextInt(60);
		int obstaculosPuestos = 0;
		do{
			int i = new Random().nextInt(10);
			int j = new Random().nextInt(10);
			if( obstaculos[i][j] == 0 && i!=0 && j!=0 ){
				obstaculos[i][j] = 1;
				obstaculosPuestos++;
			}
		}while(obstaculosPuestos<numObstaculos);
		
		hacerMovimiento(0,0);
	}
	
	private boolean encontrado = false;

	protected void hacerMovimiento(int fila, int col) {
	    if (fila < 0 || fila >= 10 || col < 0 || col >= 10 || resultado[fila][col] == 1 || obstaculos[fila][col] == 1)
	        return;

	    resultado[fila][col] = 1;
	    if(fila == 10 && col == 10)
	    	encontrado = true;

	    if (!encontrado) {
	    	hacerMovimiento(fila, col - 1);
	    	hacerMovimiento(fila, col + 1);
	    	hacerMovimiento(fila - 1, col);
	    	hacerMovimiento(fila + 1, col);
	    }
	}

	public int[][] getObstaculos() {
		return obstaculos;
	}

	public int[][] getResultado() {
		return resultado;
	}
}
