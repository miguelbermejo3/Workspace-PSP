package Ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Calculadora extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		setTitle("Práctica 1 PSP");
		getContentPane().setLayout(null);
		
		JButton Calculadora = new JButton("Calculadora");
		Calculadora.setIcon(new ImageIcon("C:\\Users\\mbermejo8774\\Downloads\\Calculator_30001 (1).png"));
		Calculadora.setBounds(109, 26, 191, 52);
		getContentPane().add(Calculadora);
		
		JButton btnBlocDeNota = new JButton("Bloc de Nota");
		btnBlocDeNota.setIcon(new ImageIcon("C:\\Users\\mbermejo8774\\Downloads\\notebook_note_notes_7278.png"));
		btnBlocDeNota.setBounds(109, 113, 191, 52);
		getContentPane().add(btnBlocDeNota);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
