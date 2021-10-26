package interfaz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JPanel;



public class PanelTablero extends JPanel{

	private boolean[][] tablero;
	private int ancho=500;
	
	public PanelTablero(boolean[][] tablerox) {
		
		setVisible(true);
		tablero = tablerox;
	}

	public void paint(Graphics g) {
		
		System.out.println("grph");
		Graphics2D g2D = (Graphics2D) g;
		
		int lado = ancho/tablero.length;
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j]) {
					g2D.setPaint(Color.YELLOW);
					g2D.setStroke(new BasicStroke(3));
					g2D.fillRect(0+lado*i, 0+lado*j, lado,lado);
					g2D.setPaint(Color.BLACK);
					g2D.drawRect(0+lado*i, 0+lado*j, lado,lado);
				}else {
					g2D.setPaint(Color.GRAY);
					g2D.setStroke(new BasicStroke(3));
					g2D.fillRect(0+lado*i, 0+lado*j, lado,lado);
					g2D.setPaint(Color.BLACK);
					g2D.drawRect(0+lado*i, 0+lado*j, lado,lado);
				}
			}
		}
		
	}
}
