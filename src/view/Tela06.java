package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Tela06 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1148875812029315178L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela06 frame = new Tela06();
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
	public Tela06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 471);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNovoPedido = new JLabel("Novo Pedido");
		lblNovoPedido.setVerticalAlignment(SwingConstants.TOP);
		lblNovoPedido.setOpaque(true);
		lblNovoPedido.setHorizontalAlignment(SwingConstants.LEFT);
		lblNovoPedido.setForeground(Color.WHITE);
		lblNovoPedido.setFont(new Font("Tahoma", Font.BOLD, 58));
		lblNovoPedido.setBackground(Color.GRAY);
		lblNovoPedido.setBounds(0, 0, 540, 60);
		contentPane.add(lblNovoPedido);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 73, 46, 14);
		contentPane.add(lblCliente);

		textField = new JTextField();
		textField.setBounds(58, 71, 233, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblPrazoDeEntrega = new JLabel("Prazo de entrega");
		lblPrazoDeEntrega.setBounds(302, 71, 93, 14);
		contentPane.add(lblPrazoDeEntrega);

		JLabel lblVendedor = new JLabel("Vendedor");
		lblVendedor.setBounds(9, 106, 46, 14);
		contentPane.add(lblVendedor);

		textField_1 = new JTextField();
		textField_1.setBounds(58, 102, 233, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblDataDaVenda = new JLabel("Data da venda");
		lblDataDaVenda.setBounds(302, 106, 82, 14);
		contentPane.add(lblDataDaVenda);

		textField_2 = new JTextField();
		textField_2.setBounds(405, 70, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(407, 103, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Receitas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 168, 481, 157);
		contentPane.add(panel);

		JLabel lblapenasUmaReceita = new JLabel("*Apenas uma receita por pedido");
		lblapenasUmaReceita.setForeground(Color.RED);
		lblapenasUmaReceita.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblapenasUmaReceita.setBounds(10, 326, 188, 14);
		contentPane.add(lblapenasUmaReceita);

		JButton btnCriarPedido = new JButton("Criar pedido");
		btnCriarPedido.setBounds(10, 383, 114, 23);
		contentPane.add(btnCriarPedido);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(144, 383, 89, 23);
		contentPane.add(btnVoltar);

		JLabel lblCdigoContrato = new JLabel("C\u00F3d. Contrato");
		lblCdigoContrato.setBounds(10, 138, 82, 14);
		contentPane.add(lblCdigoContrato);

		textField_4 = new JTextField();
		textField_4.setBounds(95, 137, 196, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(390, 351, 101, 70);
		contentPane.add(lblNewLabel);
	}

}
