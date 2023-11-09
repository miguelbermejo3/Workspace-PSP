package blocNota;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import actividad1.App;

public class BlocNota {

	private JFrame frmEjercicioPsp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlocNota window = new BlocNota();
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
	public BlocNota() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicioPsp = new JFrame();
		frmEjercicioPsp.setTitle("Ejercicio 1 PSP");
		frmEjercicioPsp.setBounds(100, 100, 450, 300);
		frmEjercicioPsp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicioPsp.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Calculadora");
		btnNewButton.setIcon(
				new ImageIcon("C:\\Users\\mbermejo8774\\Workspace-psp\\Tema1\\src\\blocNota\\images\\calculadora.png"));
		btnNewButton.setBounds(120, 23, 186, 47);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String ruta = "C:\\WINDOWS\\System32\\calc";

				App app = new App();

				app.iniciar(ruta);

			}

		});
		frmEjercicioPsp.getContentPane().add(btnNewButton);

		JButton btnBlocDeNota = new JButton("Bloc de Nota");
		btnBlocDeNota.setIcon(
				new ImageIcon("C:\\Users\\mbermejo8774\\Workspace-psp\\Tema1\\src\\blocNota\\images\\notas.png"));
		btnBlocDeNota.setBounds(120, 127, 186, 47);
		btnBlocDeNota.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String ruta = "C:\\WINDOWS\\System32\\notepad.exe";

				App app = new App();

				app.iniciar(ruta);

			}

		});
		frmEjercicioPsp.getContentPane().add(btnBlocDeNota);
	}

}
