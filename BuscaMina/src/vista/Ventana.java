package vista;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	private PanelSuperior ps;
	private PanelCentral pc;

	public Ventana(String title, int nivel) throws HeadlessException {
		super(title);
		this.setBounds(100, 100, 700, 500);
		this.setLayout(new BorderLayout(5,10));
		ps = new PanelSuperior();
		pc = new PanelCentral(nivel);
		this.add(ps, BorderLayout.NORTH);
		this.add(pc, BorderLayout.CENTER);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public PanelSuperior getPs() {
		return ps;
	}

	public void setPs(PanelSuperior ps) {
		this.ps = ps;
	}

	public PanelCentral getPc() {
		return pc;
	}

	public void setPc(PanelCentral pc) {
		this.pc = pc;
	}



}
