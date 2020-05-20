package modelo;

import controlador.Buscaminas;
import java.util.Random;

public class Tablero {

	private int tab[][];
	private int ancho, alto;

	public Tablero(int x, int y, int ancho, int alto) {
		tab = new int[alto][ancho];
		Random r = new Random(System.currentTimeMillis());
		int contador=0;
		while(contador<Buscaminas.cantMinas){
			int mx, my;
			mx = r.nextInt(ancho);
			my = r.nextInt(alto);
			if(mx!=x&&my!=y&&tab[my][mx]!=9){
				tab[my][mx] = 9;
				contador++;
				for (int i = -1; i < 2; i++) {
					for (int j = -1; j < 2; j++) {
						if(i!=0||j!=0){
							try{
								if(tab[my+i][mx+j]!=9)
									tab[my+i][mx+j]++;
							}catch(ArrayIndexOutOfBoundsException e){
								//no hacer nada
							}
						}
					}
				}
			}


		}
	}

	public void imprimirMatriz(){
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print(getTab()[i][j]+" ");
			}
			System.out.println("");
		}
	}

	public int[][] getTab() {
		return tab;
	}

	public void setTab(int[][] tab) {
		this.setTab(tab);
	}


	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}

	public boolean verificarSiHayMina(int x, int y){
		return tab[y][x]==9;
	}

}
