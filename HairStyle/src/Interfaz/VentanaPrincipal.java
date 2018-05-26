package Interfaz;

import java.awt.*;
import javax.swing.*;
import modelo.*;

public class VentanaPrincipal extends JFrame{
	
	private PanelBotones botones;
	private PanelShampoo shampoo;
	private PanelElementos elementos;
	
	public VentanaPrincipal(){
		
		botones = new PanelBotones(this);
		shampoo = new PanelShampoo(this);
		elementos = new PanelElementos(this);
		
		setSize(1200,700);
		setTitle("HairStyle --- B I E N V E N I D O --- HairStyle");
		setResizable(false);
		
		
		setLayout(new BorderLayout());
				
		add(shampoo,BorderLayout.CENTER);
		add(botones,BorderLayout.SOUTH);
		add(elementos,BorderLayout.EAST);
		
	}
	
	public void crearUsuario(String nombre, String contra){
		
		Usuario nuevo = new Usuario(nombre,contra);
	}
	
	public void iniciarSesion(String nombre, String contra){
		
				
	}
	
	
	public static void main(String args[]){
		
		
		VentanaPrincipal v = new VentanaPrincipal();
		v.setVisible(true);
	}

}
