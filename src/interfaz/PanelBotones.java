package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBotones extends JPanel implements ActionListener{

	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private interfaz_main principal;

	public PanelBotones(interfaz_main main) {
		principal=main;
		setLayout( new GridLayout(4,1) );

		btn_1 = new JButton("NUEVO");
		btn_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				principal.Nuevo_Tablero();
			}
		});
		
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

	@Override
	public void actionPerformed(ActionEvent e) {//No hace nada, no sé porque me hace ponerlo otra vez.
		// TODO Auto-generated method stub
		
	}

}
