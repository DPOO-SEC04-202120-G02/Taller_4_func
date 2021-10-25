package interfaz;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
public class PanelInfo extends JPanel{
	
	private JLabel lblJugadas;
	private JLabel lblJugador;
	private JLabel dispJugadas;
	private JLabel dispJugador;
	
	public PanelInfo() {
		setLayout(new GridLayout(1,4));
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		lblJugadas= new JLabel("Jugadas: ");
		lblJugadas.setBorder(border);
		add(lblJugadas);
		dispJugadas= new JLabel();
		dispJugadas.setBorder(border);
		add(dispJugadas);
		lblJugador= new JLabel("Jugador: ");
		lblJugador.setBorder(border);
		add(lblJugador);
		dispJugador= new JLabel();
		dispJugador.setBorder(border);
		add(dispJugador);
		
		setVisible(true);
	}

}
