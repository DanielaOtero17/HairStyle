package Interfaz;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelShampoo extends JPanel implements MouseListener{

	
	private VentanaPrincipal ventana;
	private JLabel foto;
	private ImageIcon[] imagenes;

	
	public PanelShampoo(VentanaPrincipal v){
		
		ventana = v;

		
		
		foto = new JLabel("");
		
		JLabel texto = new JLabel("Bienvenida a HairStyle");
		JLabel cuerpo = new JLabel("aaa");
		JPanel info = new JPanel();
		info.setForeground(Color.pink);
		info.setLayout(new GridLayout(2,1));
		info.add(texto);
		info.add(cuerpo);		
		
		setLayout(new BorderLayout());
		
		add(foto,BorderLayout.CENTER);
		
		imagenes = new ImageIcon[3];
		
		imagenes[0] = new ImageIcon("./imagenes/argan.png");
		imagenes[1] = new ImageIcon("./imagenes/aloeVera.png");
		imagenes[2] = new ImageIcon("./imagenes/coco.png");
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		ImageIcon imagen = new ImageIcon("./imagenes/movimiento.gif");
		
		g.drawImage(imagen.getImage(), 0, 0, null);
		g.drawImage(imagenes[0].getImage(), 20, 530, null);
		g.drawImage(imagenes[1].getImage(), 200, 500, null);
		g.drawImage(imagenes[2].getImage(), 380, 550, null);
		g.drawString("Aceite de argán", 20, 600);
		
		revalidate();
		repaint();
		}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
