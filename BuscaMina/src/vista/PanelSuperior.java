package vista;

import controlador.Buscaminas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSuperior extends JPanel {

	private JLabel tiempo;
	private JLabel contadorMinas;
	private JButton funciones;

	public PanelSuperior() {
		tiempo = new JLabel("05:00");
		contadorMinas = new JLabel(Buscaminas.cantMinas+"");
		funciones = new JButton(">:v");
		funciones.addActionListener(Buscaminas.cb);
		tiempo.setBackground(Color.black);
		tiempo.setForeground(Color.red);
		contadorMinas.setBackground(Color.black);
		contadorMinas.setForeground(Color.red);
		this.setLayout(new GridLayout(1, 3));
		this.add(contadorMinas);
		this.add(funciones);
		this.add(tiempo);
	}

	public JLabel getTiempo() {
		return tiempo;
	}

	public void setTiempo(JLabel tiempo) {
		this.tiempo = tiempo;
	}

	public JLabel getContadorMinas() {
		return contadorMinas;
	}
	public void setContadorMinas(JLabel contadorMinas) {
		this.contadorMinas = contadorMinas;
	}

	public JButton getFunciones() {
		return funciones;
	}

	public void setFunciones(JButton funciones) {
		this.funciones = funciones;
	}

}
