package presentacion.graficos;

import javax.swing.JFrame;

public class JVentana extends JFrame {
	public JVentana() {
		//definici�n de t�tulo para la ventana
		super("Primera ventana");
		//comportamiento de bot�n de cierre
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//posicionamiento y tama�o
		this.setBounds(100, 100, 800, 400);
		//visibilidad
		this.setVisible(true);
	}
}
