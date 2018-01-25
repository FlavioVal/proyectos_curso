package presentacion.graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JVentana extends JFrame {
	public JVentana() {
		//definición de título para la ventana
		super("Primera ventana");
		//comportamiento de botón de cierre
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//posicionamiento y tamaño
		this.setBounds(100, 100, 800, 400);
		
		//realizamos la creacion y colocación de componentes graficos
		iniciarComponenetes();
		
		//visibilidad (la visibilidad deberia ir siempre ultimo)
		this.setVisible(true);
	}
	
	private void iniciarComponenetes() {
		//Antes de crear algo debemos anular el gestor de organización. por que el gestor de contenido permite crear cada componente encima de otro.
		this.setLayout(null);
		
		//Creación del Objeto
		JButton bt = new JButton("Pulsar");
		JLabel lb = new JLabel("Mensaje");
		//Posicionamiento del Objeto
		bt.setBounds(150, 100, 120, 50);
		lb.setBounds(300, 50, 120, 50);
		//Añadir control a la ventana
		this.add(bt);
		this.add(lb);
	}
}
