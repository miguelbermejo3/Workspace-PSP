package ejercicio1;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Calculadora {

	private JFrame frmEjercicioPsp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmEjercicioPsp.setVisible(true);
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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicioPsp = new JFrame();
		frmEjercicioPsp.setTitle("Ejercicio  1 PSP");
		frmEjercicioPsp.setBounds(100, 100, 450, 300);
		frmEjercicioPsp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicioPsp.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Calculadora");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\mbermejo8774\\Downloads\\Calculator_30001 (1).png"));
		btnNewButton.setBounds(96, 39, 211, 49);
		frmEjercicioPsp.getContentPane().add(btnNewButton);
		
		JButton btnBlocDeNota = new JButton("Bloc de Nota");
		btnBlocDeNota.setIcon(new ImageIcon("C:\\Users\\mbermejo8774\\Downloads\\notebook_note_notes_7278.png"));
		btnBlocDeNota.setBounds(96, 116, 211, 49);
		frmEjercicioPsp.getContentPane().add(btnBlocDeNota);
	}
}
