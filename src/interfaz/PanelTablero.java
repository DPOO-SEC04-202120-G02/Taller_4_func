package interfaz;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelTablero extends JPanel{

	public PanelTablero(int n) {
		setLayout(new GridLayout(n,n));
		setVisible(true);
		for (int i = 0; i < n*n; i++) {
			
			add(new Casilla());
			
		}
		
	}

}
