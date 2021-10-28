package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class DialogoRegistro extends JDialog implements ActionListener{
	private interfaz_main principal;
	private JButton button;
	private JTextField textField;
	
	public DialogoRegistro(interfaz_main principal) {
		setTitle("Jugador");
		this.principal = principal;
		this.setLayout(new FlowLayout());
		
		button = new JButton("Aceptar");
		button.addActionListener(this);
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 15));
		textField.setForeground(new Color(0xffffff));
		textField.setBackground(Color.BLACK);
		textField.setCaretColor(Color.WHITE);
		textField.setText("Ingrese nombre del jugador");
		
		
		
		this.add(textField);
		this.add(button);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			String entrada = textField.getText();
			principal.cambiarJugador(entrada);
			this.setVisible(false);
		}
		
	}
}
