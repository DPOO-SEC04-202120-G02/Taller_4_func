package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import uniandes.dpoo.taller4.modelo.Tablero;

public class interfaz_main extends JFrame{

	private PanelBotones panelBotones;//El panel de los botones jajaja xd
	private PanelCaracteristicas panelCaracteristicas;
	private PanelInfo panelInfo;
	private PanelTablero panelTablero;
	private JPanel pa;//El panel que organiza a los otros
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
		panelTablero = new PanelTablero(tablero_actual.darTablero(),this);
		panelTablero.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int click_x = e.getX();
				int click_y = e.getY();
				int[] casilla = panelTablero.convertirCoordenadasACasilla(click_x, click_y);
				jugar(casilla);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		pa.add(panelTablero,BorderLayout.CENTER);
		add(pa);
		setVisible(true);
	}

	public static void main(String[] args) {
		new interfaz_main();
		
	}
	
	public void Nuevo_Tablero() {//Genera un nuevo tablero
		
		BorderLayout layout = (BorderLayout)pa.getLayout();
		pa.remove(layout.getLayoutComponent(BorderLayout.CENTER));
		
		int dim=panelCaracteristicas.GetDimension();
		int dif=panelCaracteristicas.GetDificultad();
		tablero_actual= new Tablero(dim);
		tablero_actual.desordenar(dif);
		panelTablero = new PanelTablero(tablero_actual.darTablero(),this);
		pa.add(panelTablero,BorderLayout.CENTER);
		pa.validate();//Magicamente lo resetea.
	}
	
	public void jugar(int[] coordenadas) {//
		tablero_actual.jugar(coordenadas[0],coordenadas[1]);
		boolean[][] new_matrix = tablero_actual.darTablero();
		panelTablero = new PanelTablero(new_matrix,this);
		pa.add(panelTablero,BorderLayout.CENTER);
		pa.validate();//Magicamente lo resetea.
		if(panelTablero.verificar_tablero()) {
			System.out.println("tablero completado");//Modificar para lo que necesite.
		}
	}
	
	
}
