package presentacion.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

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
		
		//Agregando una etiqueta que muestre la hora y no pare, usando multitarea.
		JLabel lbReloj=new JLabel();		
		lbReloj.setBounds(300, 40, 120, 40);
		this.add(lbReloj);
		
		//tarea actualización de la hora.
	
		Timer temp=new Timer();
		temp.schedule(new TimerTask() {
			
			@Override
			public void run() {
				LocalTime lt= LocalTime.now();
				lbReloj.setText(lt.toString());
			}
		},0,300);
		
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				temp.cancel();
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Fin del reloj con Timer()
		
		//posicionamiento del objeto
		tf1.setBounds(50, 30, 120, 40);
		tf2.setBounds(50, 80, 120, 40);
		bt1.setBounds(100, 140, 120, 40);
		bt2.setBounds(300, 140, 120, 40);
		lb.setBounds(150,200,100,40);
		//añadir control a la ventana
		this.add(tf1);this.add(tf2);
		this.add(bt1);this.add(bt2);
		this.add(lb);
		
		
		
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
