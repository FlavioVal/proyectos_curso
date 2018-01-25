package presentacion.graficos;

import javax.swing.JFrame;

public class JVentana extends JFrame {
	public JVentana() {
		//definición de título para la ventana
		super("Primera ventana");
		//comportamiento de botón de cierre
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//posicionamiento y tamaño
		this.setBounds(100, 100, 800, 400);
		//visibilidad
		this.setVisible(true);
	}
}
