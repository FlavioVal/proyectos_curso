package presentacion.graficos;

import java.awt.event.ActionListener;

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
		//realizamos creación y colocación de
		//componentes gráficos
		iniciarComponentes();
		//visibilidad
		this.setVisible(true);
	}
	private void iniciarComponentes() {
		//Anular gestor de organización
		this.setLayout(null);
		//Creación del objeto
		JButton bt=new JButton("Pulsar");
		JLabel lb=new JLabel("Mensaje");
		//posicionamiento del objeto
		bt.setBounds(150, 100, 120, 50);
		lb.setBounds(300, 50, 120, 50);
		//añadir control a la ventana
		this.add(bt);
		this.add(lb);
		
		//listeners
		ActionListener lst=e->lb.setText("Bienvenido a swing");
		bt.addActionListener(lst);
		
	}
}
