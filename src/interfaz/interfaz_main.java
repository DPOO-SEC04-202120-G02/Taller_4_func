package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

import uniandes.dpoo.taller4.modelo.Tablero;

public class interfaz_main extends JFrame{

	private PanelBotones panelBotones;//El panel de los botones jajaja xd
	private PanelCaracteristicas panelCaracteristicas;
	private PanelInfo panelInfo;
	private PanelTablero panelTablero;
	private JPanel pa;
	private Tablero tablero_actual;
	
	public interfaz_main() {
		setTitle("ventana swing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(714,587);//Calculado
		setResizable(false);
		setVisible(true);
		pa = new JPanel();
		pa.setLayout( new BorderLayout( ) );
		//Panel de arriba
		panelCaracteristicas= new PanelCaracteristicas();
		panelCaracteristicas.setPreferredSize(new Dimension(700, 25)); 
		pa.add(panelCaracteristicas, BorderLayout.NORTH);
		//Panel de la derecha
		panelBotones = new PanelBotones(this);
		panelBotones.setPreferredSize(new Dimension(200, 500)); 
		pa.add(panelBotones, BorderLayout.EAST);
		//Panel de abajo
		panelInfo = new PanelInfo();
		panelInfo.setPreferredSize(new Dimension(700, 25)); 
		pa.add(panelInfo, BorderLayout.SOUTH);
		//Tablero
		int dim=panelCaracteristicas.GetDimension();
		int dif=panelCaracteristicas.GetDificultad();
		tablero_actual= new Tablero(dim);
		tablero_actual.desordenar(dif);
		panelTablero = new PanelTablero(tablero_actual.darTablero());
		pa.add(panelTablero,BorderLayout.CENTER);
		add(pa);
		setVisible(true);
	}

	public static void main(String[] args) {
		new interfaz_main();
		
	}
	
	public void Nuevo_Tablero() {
		
		BorderLayout layout = (BorderLayout)pa.getLayout();
		pa.remove(layout.getLayoutComponent(BorderLayout.CENTER));
		
		int dim=panelCaracteristicas.GetDimension();
		System.out.println(dim);
		int dif=panelCaracteristicas.GetDificultad();
		System.out.println(dif);
		tablero_actual= new Tablero(dim);
		tablero_actual.desordenar(dif);
		panelTablero = new PanelTablero(tablero_actual.darTablero());
		pa.add(panelTablero,BorderLayout.CENTER);
		System.out.println("dadwada");
		pa.validate();//Magicamente lo resetea.
	}
	
	//Listeners
	
	
	
}
