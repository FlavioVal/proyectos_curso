package presentacion.graficos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JVentana extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVentana frame = new JVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl= new JLabel("Resultado");;
		JButton bt1 = new JButton("Sumar");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1=Integer.parseInt(tf1.getText());
				int n2=Integer.parseInt(tf2.getText());
				lbl.setText(""+(n1+n2));
			}
		});
		bt1.setBounds(138, 110, 89, 23);
		contentPane.add(bt1);
		
		tf1 = new JTextField();
		tf1.setBounds(138, 22, 86, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(141, 65, 86, 20);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JButton bt2 = new JButton("Multiplicar");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1=Integer.parseInt(tf1.getText());
				int n2=Integer.parseInt(tf2.getText());
				lbl.setText(""+(n1*n2));
			}
		});
		bt2.setBounds(138, 167, 89, 23);
		contentPane.add(bt2);
		
		lbl.setBounds(328, 110, 52, 23);
		contentPane.add(lbl);
	}
}
