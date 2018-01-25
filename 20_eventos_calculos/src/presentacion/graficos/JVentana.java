package presentacion.graficos;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		JTextField tf1=new JTextField();
		JTextField tf2=new JTextField();
		JButton bt1=new JButton("Sumar");
		JButton bt2=new JButton("Multiplicar");
		JLabel lb=new JLabel("Resultado");
	
		//posicionamiento del objeto
		tf1.setBounds(150, 100, 120, 50);
		tf2.setBounds(150, 180, 120, 50);
		bt1.setBounds(150, 240, 120, 50);
		bt2.setBounds(300, 240, 120, 50);
		lb.setBounds(150, 290, 120, 50);
		//añadir control a la ventana
		this.add(tf1);
		this.add(tf2);
		this.add(bt1);
		this.add(bt2);
		this.add(lb);
		
		//listeners
		ActionListener lst1=e->{
			int n1=Integer.parseInt(tf1.getText());
			int n2=Integer.parseInt(tf2.getText());
			lb.setText(""+(n1+n2));
		};
		
		ActionListener lst2=e->{
			int n1=Integer.parseInt(tf1.getText());
			int n2=Integer.parseInt(tf2.getText());
			lb.setText(""+(n1*n2));
		};
		
		bt1.addActionListener(lst1);
		bt2.addActionListener(lst2);
		
	}
}
