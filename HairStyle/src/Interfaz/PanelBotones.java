package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotones extends JPanel implements ActionListener{

	public final static String GUARDAR = "Guardar";
	private VentanaPrincipal ventana;
	private JButton guardar;
	
	public PanelBotones(VentanaPrincipal v){
		
		ventana = v;
		guardar = new JButton("Guardar");
		
		setLayout(new GridLayout(1,1));
		
		guardar.setActionCommand(GUARDAR);
		guardar.addActionListener(this);
		add(guardar);
	}

	@Override
	public void actionPerformed(ActionEvent g) {
		
		String e = g.getActionCommand();
		
		if(e.equals(GUARDAR)){
			
			
			
		}
		
		
	}
}
