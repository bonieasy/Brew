package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class Tela08 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela08 frame = new Tela08();
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
	public Tela08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 354);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPedidos = new JLabel("Pedidos");
		lblPedidos.setVerticalAlignment(SwingConstants.TOP);
		lblPedidos.setOpaque(true);
		lblPedidos.setHorizontalAlignment(SwingConstants.LEFT);
		lblPedidos.setForeground(Color.WHITE);
		lblPedidos.setFont(new Font("Tahoma", Font.BOLD, 58));
		lblPedidos.setBackground(Color.GRAY);
		lblPedidos.setBounds(0, 0, 528, 60);
		contentPane.add(lblPedidos);

		JButton btnNovoPedido = new JButton("Novo pedido");
		btnNovoPedido.setBounds(10, 97, 106, 23);
		contentPane.add(btnNovoPedido);

		JButton btnExcluirPedido = new JButton("Excluir pedido");
		btnExcluirPedido.setBounds(10, 131, 106, 23);
		contentPane.add(btnExcluirPedido);

		JButton btnVisualizar = new JButton("Voltar");
		btnVisualizar.setBounds(10, 165, 106, 23);
		contentPane.add(btnVisualizar);

		JButton btnIniciarProduo = new JButton("Iniciar");
		btnIniciarProduo.setBounds(10, 199, 106, 23);
		contentPane.add(btnIniciarProduo);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pedidos", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(138, 97, 352, 122);
		contentPane.add(panel);

		JLabel label = new JLabel("");
		label.setBounds(407, 230, 83, 75);
		contentPane.add(label);
	}
}
