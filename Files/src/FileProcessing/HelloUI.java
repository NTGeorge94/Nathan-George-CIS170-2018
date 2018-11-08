package FileProcessing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloUI window = new HelloUI();
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
	public HelloUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Hello");
			}
		});
		btnSubmit.setBounds(322, 213, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(121, 38, 95, 22);
		frame.getContentPane().add(textArea);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(38, 43, 73, 14);
		frame.getContentPane().add(lblFirstName);
	}
}
