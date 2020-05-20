
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;


public class ControladorBotones implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(Buscaminas.ventanita.getPs().getFunciones())) {
			Buscaminas.reiniciar();
		} else {

			int arr[] = Buscaminas.ventanita.getPc().botonPresionado((JButton) e.getSource());

			if(!Buscaminas.iniciado){
				Buscaminas.nuevaPartida(arr[1], arr[0], 1);
				Buscaminas.iniciado = true;
			}
			if (arr != null) {
				if ((e.getModifiers() & 4) !=0){
					Buscaminas.colocarBandera(arr[0], arr[1]);
				}else if((e.getModifiers() & 16) !=0){
					Buscaminas.partida.destaparCasilla(arr[1], arr[0]);
				}
			}
		}
	}

}

