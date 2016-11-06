package view;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import controller.LoginController;
import model.Usuario;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela01 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 window = new Tela01();
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
	public Tela01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 394, 289);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(148, 107, 155, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(100, 110, 46, 14);
		frame.getContentPane().add(lblUsurio);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(100, 130, 46, 14);
		frame.getContentPane().add(lblSenha);

		//codificação do botão LOGIN
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usuario = textField.getText();
				String senha = String.valueOf(passwordField.getPassword());
                Usuario usuarios = new Usuario();
                usuarios.setUsuario(usuario);
                usuarios.setSenha(senha);
                
                LoginController controller = new LoginController();
                if (controller.validarLogin(usuarios)) {
                	frame.setVisible(false);
                    Tela02 f = new Tela02();
                    f.setVisible(true);
                } else 
                	JOptionPane.showMessageDialog(null, "Login e/ou Senha incorretos!");           
            }
		});
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(148, 157, 89, 23);
		frame.getContentPane().add(btnLogin);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(26, 78, 64, 93);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblAcesso = new JLabel("Bem Vindo");
		lblAcesso.setVerticalAlignment(SwingConstants.TOP);
		lblAcesso.setOpaque(true);
		lblAcesso.setHorizontalAlignment(SwingConstants.LEFT);
		lblAcesso.setForeground(Color.WHITE);
		lblAcesso.setFont(new Font("Tahoma", Font.BOLD, 58));
		lblAcesso.setBackground(Color.GRAY);
		lblAcesso.setBounds(0, 1, 378, 60);
		frame.getContentPane().add(lblAcesso);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 127, 155, 20);
		frame.getContentPane().add(passwordField);
	}
}
