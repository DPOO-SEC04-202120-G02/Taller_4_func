package interfaz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;



public class PanelTablero extends JPanel{

	private boolean[][] tablero;
	private int ancho=500;
	private interfaz_main principal;

	public PanelTablero(boolean[][] tablerox, interfaz_main interfaz) {
		principal=interfaz;
		setVisible(true);
		tablero = tablerox;
	}

	public void paint(Graphics g) {//Dibujar el tablero

		Graphics2D g2D = (Graphics2D) g;

		int lado = ancho/tablero.length;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j]) {//Cuadros amarillos
					g2D.setPaint(Color.YELLOW);
					g2D.setStroke(new BasicStroke(3));
					g2D.fillRect(0+lado*i, 0+lado*j, lado,lado);
					g2D.setPaint(Color.BLACK);
					g2D.drawRect(0+lado*i, 0+lado*j, lado,lado);
				}else {//cuadros grises.
					g2D.setPaint(Color.GRAY);
					g2D.setStroke(new BasicStroke(3));
					g2D.fillRect(0+lado*i, 0+lado*j, lado,lado);
					g2D.setPaint(Color.BLACK);
					g2D.drawRect(0+lado*i, 0+lado*j, lado,lado);
				}
			}
		}

	}
	//Retorna true si todas las casillas del tablero estan encendidas
	public boolean verificar_tablero() {
		
		boolean estado = true;//True si todas las reviadas han sido true
		int i =0;
		int j =0;
		int dim=tablero.length;
		while (estado && ((i<dim && j<dim))) {
			if(!tablero[j][i]) {
				estado=false;
			}
			
			
			if (j==dim-1) {
				i++;
				j=0;
			}else {
				j++;
			}
		}
		return estado;
	}
	
	public int[] convertirCoordenadasACasilla(int x, int y)//Dadas unas coordenadas x,y en el panel retorna la casilla correspondiente.
	{
		int ladoTablero = tablero.length;
		int altoPanelTablero = getHeight();
		int anchoPanelTablero = getWidth();
		int altoCasilla = altoPanelTablero / ladoTablero;
		int anchoCasilla = anchoPanelTablero / ladoTablero;
		int fila = (int) (y / altoCasilla);
		int columna = (int) (x / anchoCasilla);
		return new int[] { columna, fila };
	}

}
