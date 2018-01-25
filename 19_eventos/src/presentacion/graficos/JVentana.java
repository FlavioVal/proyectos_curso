package presentacion.graficos;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JVentana extends JFrame {
	public JVentana() {
		//definici�n de t�tulo para la ventana
		super("Primera ventana");
		//comportamiento de bot�n de cierre
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//posicionamiento y tama�o
		this.setBounds(100, 100, 800, 400);
		//realizamos creaci�n y colocaci�n de
		//componentes gr�ficos
		iniciarComponentes();
		//visibilidad
		this.setVisible(true);
	}
	private void iniciarComponentes() {
		//Anular gestor de organizaci�n
		this.setLayout(null);
		//Creaci�n del objeto
		JButton bt=new JButton("Pulsar");
		JLabel lb=new JLabel("Mensaje");
		//posicionamiento del objeto
		bt.setBounds(150, 100, 120, 50);
		lb.setBounds(300, 50, 120, 50);
		//a�adir control a la ventana
		this.add(bt);
		this.add(lb);
		
		//listeners
		ActionListener lst=e->lb.setText("Bienvenido a swing");
		bt.addActionListener(lst);
		
	}
}
