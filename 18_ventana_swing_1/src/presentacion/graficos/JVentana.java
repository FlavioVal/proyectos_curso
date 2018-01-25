package presentacion.graficos;

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
		
		//realizamos la creacion y colocaci�n de componentes graficos
		iniciarComponenetes();
		
		//visibilidad (la visibilidad deberia ir siempre ultimo)
		this.setVisible(true);
	}
	
	private void iniciarComponenetes() {
		//Antes de crear algo debemos anular el gestor de organizaci�n. por que el gestor de contenido permite crear cada componente encima de otro.
		this.setLayout(null);
		
		//Creaci�n del Objeto
		JButton bt = new JButton("Pulsar");
		JLabel lb = new JLabel("Mensaje");
		//Posicionamiento del Objeto
		bt.setBounds(150, 100, 120, 50);
		lb.setBounds(300, 50, 120, 50);
		//A�adir control a la ventana
		this.add(bt);
		this.add(lb);
	}
}
