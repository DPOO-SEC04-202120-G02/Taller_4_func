package interfaz;

import java.awt.BorderLayout;

import javax.swing.*;

public class interfaz_main extends JFrame{

	private PanelBotones panelBotones;//El panel de los botones jajaja xd
	private PanelCaracteristicas panelCaracteristicas;
	private PanelInfo panelInfo;
	private PanelTablero panelTablero;
	
	
	public interfaz_main() {
		setTitle("ventana swing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		JPanel pa = new JPanel();
		pa.setLayout( new BorderLayout( ) );
		//Panel de arriba
		panelCaracteristicas= new PanelCaracteristicas();
		pa.add(panelCaracteristicas, BorderLayout.NORTH);
		//Panel de la derecha
		panelBotones = new PanelBotones();
		pa.add(panelBotones, BorderLayout.EAST);
		//Panel de abajo
		panelInfo = new PanelInfo();
		pa.add(panelInfo, BorderLayout.SOUTH);
		//Tablero
		panelTablero = new PanelTablero(5);
		pa.add(panelTablero, BorderLayout.CENTER);
		
		//Añadir el panel padre y hacerlo visible
		add(pa);
		setVisible(true);
	}

	public static void main(String[] args) {
		new interfaz_main();
		
	}

}
