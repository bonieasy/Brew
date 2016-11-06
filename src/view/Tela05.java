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
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Tela05 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela05 frame = new Tela05();
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
	public Tela05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNomerazoSocial = new JLabel("Nome/Raz\u00E3o Social");
		lblNomerazoSocial.setBounds(31, 96, 114, 14);
		contentPane.add(lblNomerazoSocial);

		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ");
		lblCpfcnpj.setBounds(31, 123, 75, 14);
		contentPane.add(lblCpfcnpj);

		JLabel lblCadastroClientes = new JLabel("Cadastro");
		lblCadastroClientes.setVerticalAlignment(SwingConstants.TOP);
		lblCadastroClientes.setOpaque(true);
		lblCadastroClientes.setHorizontalAlignment(SwingConstants.LEFT);
		lblCadastroClientes.setForeground(Color.WHITE);
		lblCadastroClientes.setFont(new Font("Tahoma", Font.BOLD, 58));
		lblCadastroClientes.setBackground(Color.GRAY);
		lblCadastroClientes.setBounds(0, 0, 503, 60);
		contentPane.add(lblCadastroClientes);

		JLabel lblNewLabel = new JLabel("Telefone");
		lblNewLabel.setBounds(31, 150, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(31, 175, 46, 14);
		contentPane.add(lblEndereo);

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(31, 200, 46, 14);
		contentPane.add(lblBairro);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(31, 225, 46, 14);
		contentPane.add(lblCidade);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(31, 277, 46, 14);
		contentPane.add(lblEmail);

		textField = new JTextField();
		textField.setBounds(132, 93, 344, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(132, 118, 344, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(132, 144, 114, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(256, 147, 46, 14);
		contentPane.add(lblCelular);

		textField_3 = new JTextField();
		textField_3.setBounds(298, 144, 179, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(131, 171, 345, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(132, 197, 170, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(323, 201, 46, 14);
		contentPane.add(lblNmero);

		textField_6 = new JTextField();
		textField_6.setBounds(390, 197, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(132, 222, 170, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(323, 223, 46, 14);
		contentPane.add(lblCep);

		textField_8 = new JTextField();
		textField_8.setBounds(390, 222, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(132, 275, 344, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 419, 86, 23);
		contentPane.add(btnCadastrar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(191, 419, 86, 23);
		contentPane.add(btnLimpar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(283, 419, 86, 23);
		contentPane.add(btnVoltar);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(390, 363, 75, 79);
		contentPane.add(lblNewLabel_1);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(101, 419, 86, 23);
		contentPane.add(btnAlterar);

		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
		lblObservaes.setBounds(31, 250, 75, 14);
		contentPane.add(lblObservaes);

		textField_10 = new JTextField();
		textField_10.setBounds(132, 247, 344, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblInformaes = new JLabel("Informa\u00E7\u00F5es");
		lblInformaes.setBounds(31, 307, 75, 14);
		contentPane.add(lblInformaes);

		JLabel lblAdicionais = new JLabel("Adicionais");
		lblAdicionais.setBounds(31, 321, 66, 14);
		contentPane.add(lblAdicionais);

		textField_11 = new JTextField();
		textField_11.setBounds(132, 306, 344, 46);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
	}

}
