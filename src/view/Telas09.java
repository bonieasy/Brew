package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Telas09 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telas09 frame = new Telas09();
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
	public Telas09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 352);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRelatrios = new JLabel("Relat\u00F3rios");
		lblRelatrios.setBounds(0, 0, 530, 60);
		lblRelatrios.setVerticalAlignment(SwingConstants.TOP);
		lblRelatrios.setOpaque(true);
		lblRelatrios.setHorizontalAlignment(SwingConstants.LEFT);
		lblRelatrios.setForeground(Color.WHITE);
		lblRelatrios.setFont(new Font("Tahoma", Font.BOLD, 58));
		lblRelatrios.setBackground(Color.GRAY);
		contentPane.add(lblRelatrios);
		
		JLabel lblReceita = new JLabel("Receita");
		lblReceita.setBounds(10, 71, 46, 14);
		contentPane.add(lblReceita);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(293, 71, 46, 14);
		contentPane.add(lblCliente);
		
		textField = new JTextField();
		textField.setBounds(63, 71, 220, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(336, 68, 171, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
