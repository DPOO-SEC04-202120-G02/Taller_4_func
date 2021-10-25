package interfaz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Casilla extends JPanel{

	private JLabel lbl;
	
	public Casilla() {
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(3));
		g2D.drawRect(0, 0, 70,70);
	}

}
