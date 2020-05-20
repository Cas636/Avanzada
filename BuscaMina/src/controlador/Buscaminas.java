
package controlador;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Partida;
import modelo.Tablero;
import vista.Ventana;


public class Buscaminas {
    
    public static Ventana ventanita;
    public static int cantMinas;
    public static Partida partida;
    public static boolean iniciado;
    public static ControladorBotones cb = new ControladorBotones();

   
    public static void main(String[] args) {
        iniciado = false;
        ventanita = new Ventana("Buscaminas Nivel "+1, 1);
        
    }
   
	
    
    public static void Peerdio(int text, int c,int f){
        JOptionPane.showMessageDialog(ventanita, "Has caido en una mina");
        //System.exit(0);
        //iniciado = false;
       // ventanita = new Ventana("Buscaminas Nivel "+1, 1); 
    }
    
    public static void nuevaPartida(int c, int f, int nivel){
        partida = new Partida(c, f, nivel);
    }

    public static void reiniciar() {
        iniciado = false;
        ventanita = new Ventana("Buscaminas Nivel "+1, 1); 
    }

    public static void colocarBandera(int f, int c) {
        ventanita.getPc().ponerBandera(f, c);
    }
    
    public static void colocarMina(int f, int c) {
        ventanita.getPc().verMina(f, c);
    }

    public static void destaparCasilla(int f, int c, int text) { 
        ventanita.getPc().ocultarBoton(f, c, text);
    }
    
}
