
package vista;

import controlador.Buscaminas;
import modelo.Tablero;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*;


public class PanelCentral extends JPanel {


	public JButton[][] getMatriz() {
		return matriz;
	}


	public void setMatriz(JButton[][] matriz) {
		this.matriz = matriz;
	}

	private JButton matriz[][];
	private int ancho, alto;

	public PanelCentral(int nivel) {
		ancho=8;
		alto=8;
		if(nivel==2){
			ancho = alto = 16;
		}else{
			if(nivel==3){
				ancho = 30;
				alto = 16;
			} 
		}
		this.setLayout(new GridLayout(alto, ancho));
		matriz = new JButton[alto][ancho];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				matriz[i][j] = new JButton();
				matriz[i][j].addActionListener(Buscaminas.cb);
				this.add(matriz[i][j]);
			}
		}

	}

	public int []botonPresionado(JButton b){
		int arr[] = new int [2];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				if(b.equals(matriz[i][j])){
					arr[0]=i;
					arr[1]=j;
					return arr;
				}
			}
		}
		return null;
	}

	public void ocultarBoton(int f, int c, int num){
		if(num==0){
			matriz[f][c].setVisible(false);
		}else{
			matriz[f][c].setText(num+"");
			this.insertaIcon(f, c, num);
		}
	}

	public void insertaIcon(int f, int c, int num) {
		switch(num){
		case 1:
			matriz[f][c].setIcon(new ImageIcon("src/Imagenes/uno.png"));
			break;
		case 2:
			matriz[f][c].setIcon(new ImageIcon("src/Imagenes/dos.png"));
			break;
		case 3:
			matriz[f][c].setIcon(new ImageIcon("src/Imagenes/tres.png"));
			break;
		case 4:
			matriz[f][c].setIcon(new ImageIcon("src/Imagenes/cuatro.png"));
			break;
		case 5:
			matriz[f][c].setIcon(new ImageIcon("src/Imagenes/cinco.png"));
			break;
		case 6:
			matriz[f][c].setIcon(new ImageIcon("src/Imagenes/seis.png"));
			break;

		}
	}
	public void verMina(int f, int c){
		matriz[f][c].setText("M");
		matriz[f][c].setIcon(new ImageIcon("src/Imagenes/mina.png"));
	}
	public void ponerBandera(int f, int c){
		if(matriz[f][c].getText().equals("B")) {
			matriz[f][c].setText("");
			matriz[f][c].setIcon(new ImageIcon("src/Imagenes/trans.png"));
			matriz[f][c].setEnabled(true);
		}else {
			matriz[f][c].setText("B");
			matriz[f][c].setIcon(new ImageIcon("src/Imagenes/bandera.png"));
			matriz[f][c].setEnabled(false);
		}
	}

}
