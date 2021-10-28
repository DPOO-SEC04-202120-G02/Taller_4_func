package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class RegistroJugador extends JPanel {
	private JLabel posicion;
	private JLabel nombre;
	private JLabel puntos;
	
	public RegistroJugador(String strPos, String strName, String strPoints) {
		setLayout(new FlowLayout());
		posicion = new JLabel(strPos);
		posicion.setFont(new Font("Verdana", Font.PLAIN, 15));
		nombre = new JLabel(strName);
		nombre.setFont(new Font("Verdana", Font.PLAIN, 15));
		puntos = new JLabel(strPoints);
		puntos.setFont(new Font("Verdana", Font.PLAIN, 15));
		add(posicion);
		add(nombre);
		add(puntos);
	}
}
