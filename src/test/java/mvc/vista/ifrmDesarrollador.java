package mvc.vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class ifrmDesarrollador extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifrmDesarrollador frame = new ifrmDesarrollador();
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
	public ifrmDesarrollador() {
		setClosable(true);
		setTitle("Acerca de : Del desarrollador");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblDesarrolladoPor = new JLabel("Desarrollado por:");
		lblDesarrolladoPor.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lblDesarrolladoPor.setBounds(62, 85, 106, 14);
		getContentPane().add(lblDesarrolladoPor);
		
		JLabel lblDiegoHRodrguez = new JLabel("Diego H. Rodríguez G.");
		lblDiegoHRodrguez.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lblDiegoHRodrguez.setBounds(166, 122, 127, 14);
		getContentPane().add(lblDiegoHRodrguez);
		
		JLabel lblSemilleroAutomatizacnTcs = new JLabel("Semillero Automatizacón TCS");
		lblSemilleroAutomatizacnTcs.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lblSemilleroAutomatizacnTcs.setBounds(149, 147, 179, 14);
		getContentPane().add(lblSemilleroAutomatizacnTcs);
		
		JLabel label = new JLabel("2019");
		label.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		label.setBounds(217, 172, 31, 14);
		getContentPane().add(label);

	}
}
