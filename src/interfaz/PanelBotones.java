package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {

	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;

	public PanelBotones() {
		setLayout( new GridLayout(4,1) );

		btn_1 = new JButton("NUEVO");
		btn_2 = new JButton("REINICIAR");
		btn_3 = new JButton("TOP-10");
		btn_4 = new JButton("CAMBIAR JUGADOR");

		add(btn_1); 
		//grid.add(Box.createVerticalStrut(3));
		add(btn_2); 
		//grid.add(Box.createVerticalStrut(3));
		add(btn_3); 
		//grid.add(Box.createVerticalStrut(3));
		add(btn_4); 
		
		
		setVisible(true);

	}

}
