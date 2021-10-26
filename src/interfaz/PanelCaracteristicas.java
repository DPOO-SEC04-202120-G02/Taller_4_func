package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelCaracteristicas extends JPanel{

	private JCheckBox  chh_facil;
	private JCheckBox  chh_medio;
	private JCheckBox  chh_dificil;
	private JLabel tamanio_lbl;
	private JLabel dificultad_lbl;
	private JComboBox cmbb_1;
	private JLabel blanck_spc1;
	private JLabel blanck_spc2;
	private ButtonGroup myButtonGroup;
	
	public PanelCaracteristicas() {
		//setLayout( new GridLayout( 1, 6 ) );
		setLayout(new FlowLayout());
		setBackground(new Color(0, 191, 255));
		//Crear elementos
		String s1[] = { "5x5", "4x4", "3x3"};

		tamanio_lbl = new JLabel("Tamaño:");
		dificultad_lbl = new JLabel("  Dificultad: ");

		chh_facil = new JCheckBox("Facil",true);
		chh_facil.setBackground(new Color(0, 191, 255));
		chh_medio = new JCheckBox("Medio");
		chh_medio.setBackground(new Color(0, 191, 255));
		chh_dificil = new JCheckBox("Dificil");
		chh_dificil.setBackground(new Color(0, 191, 255));
		ButtonGroup myButtonGroup = new ButtonGroup();
		myButtonGroup.add(chh_facil);
		myButtonGroup.add(chh_medio);
		myButtonGroup.add(chh_dificil);

		
		setVisible(true);

		cmbb_1 = new JComboBox(s1);
		
		//Add elementos
		
		add(tamanio_lbl);
		add(cmbb_1);
		add(dificultad_lbl);
		add(chh_facil);
		add(chh_medio);
		add(chh_dificil);
		
	}

	public int GetDimension() {
		
		String valor =(String) cmbb_1.getSelectedItem();
		char va = valor.charAt(0);
		return Character.getNumericValue(va);
	}
	
	public int GetDificultad() {
		if (chh_facil.isSelected()) {
			return 5;
		}else if (chh_medio.isSelected()) {
			return 7;
		}else {
			return 10;
		}
	}
	
}
