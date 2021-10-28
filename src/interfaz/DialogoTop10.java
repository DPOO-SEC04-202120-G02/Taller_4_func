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
import java.util.Collection;

import javax.swing.*;

import uniandes.dpoo.taller4.modelo.RegistroTop10;

public class DialogoTop10 extends JDialog {
	private Collection<RegistroTop10> registroGeneral;
	private JLabel header;
	private JScrollPane display;
	private JPanel panel;
	
	
	public DialogoTop10(Collection<RegistroTop10> registroGeneral) {
		
		this.registroGeneral = registroGeneral;
		
		setTitle("Top 10");
		setSize(300,500);
		setResizable(false);
		setVisible(true);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout( ));
		
		JPanel panelSup= new JPanel();
		panelSup.setPreferredSize(new Dimension(300, 36)); 
		
		header = new JLabel("# NOMBRE");
		panelSup.add(header);
		panel.add(panelSup, BorderLayout.NORTH);
		
		JPanel panelInf= new JPanel();
		panelInf.setPreferredSize(new Dimension(300, 425));
		
		if (!this.registroGeneral.isEmpty()) {
			String[] listaColores = {"#2cba00", "#2cba00", "#a3ff00", "#a3ff00", "#fff400", "#fff400", "#ffa700", "#ffa700", "#ff0000", "#ff0000"};
			int len = this.registroGeneral.size();
			panelInf.setLayout(new GridLayout(len,1));
			int pos = 0;
			for (RegistroTop10 registro: this.registroGeneral) {
				Color color = Color.decode(listaColores[pos]);
				pos += 1;
				String strPos = String.valueOf(pos);
				String strName = registro.darNombre(); 
				String strPoints = String.valueOf(registro.darPuntos());
				RegistroJugador registroJugador = new RegistroJugador(strPos, strName, strPoints);
				registroJugador.setOpaque(true);
				registroJugador.setBackground(color);
				panelInf.add(registroJugador);
			}
		}
		
		display = new JScrollPane(panelInf);
		
		panel.add(display, BorderLayout.SOUTH);
		
		header.setOpaque(true);
		header.setBackground(Color.BLACK);
		header.setForeground(Color.WHITE);
		panelSup.setBackground(Color.BLACK);
	    header.setFont(new Font("Verdana", Font.PLAIN, 18));
	    header.setBounds(0, 0, 300, 36);
	    
	    add(panel);
	}
}