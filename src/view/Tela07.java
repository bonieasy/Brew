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
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tela07 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela07 frame = new Tela07();
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
	public Tela07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 413);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblProduo = new JLabel("Produ\u00E7\u00E3o");
		lblProduo.setVerticalAlignment(SwingConstants.TOP);
		lblProduo.setOpaque(true);
		lblProduo.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduo.setForeground(Color.WHITE);
		lblProduo.setFont(new Font("Tahoma", Font.BOLD, 58));
		lblProduo.setBackground(Color.GRAY);
		lblProduo.setBounds(0, 0, 530, 60);
		contentPane.add(lblProduo);

		JLabel lblReceita = new JLabel("Receita");
		lblReceita.setBounds(10, 79, 46, 14);
		contentPane.add(lblReceita);

		textField = new JTextField();
		textField.setBounds(59, 76, 308, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tempos Produ\u00E7\u00E3o",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 135, 169, 109);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Brassagem");
		lblNewLabel.setBounds(10, 22, 63, 14);
		panel.add(lblNewLabel);

		JLabel lblFervura = new JLabel("Fervura");
		lblFervura.setBounds(10, 43, 46, 14);
		panel.add(lblFervura);

		JLabel lblFermentao = new JLabel("Fermenta\u00E7\u00E3o");
		lblFermentao.setBounds(10, 68, 74, 14);
		panel.add(lblFermentao);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tempo Rampa",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(189, 135, 178, 109);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblReouso = new JLabel("Repouso");
		lblReouso.setBounds(10, 26, 46, 14);
		panel_1.add(lblReouso);

		JLabel lblNewLabel_1 = new JLabel("Varia\u00E7\u00E3o");
		lblNewLabel_1.setBounds(10, 47, 46, 14);
		panel_1.add(lblNewLabel_1);

		JLabel lblTemperaturaAtual = new JLabel("Temperatura Atual");
		lblTemperaturaAtual.setBounds(20, 293, 102, 14);
		contentPane.add(lblTemperaturaAtual);

		JLabel lblc = new JLabel("-- \u00BAC");
		lblc.setForeground(Color.RED);
		lblc.setBounds(132, 293, 46, 14);
		contentPane.add(lblc);

		JLabel lblProcessoAtual = new JLabel("Processo Atual");
		lblProcessoAtual.setBounds(20, 266, 89, 14);
		contentPane.add(lblProcessoAtual);

		JLabel label = new JLabel("--");
		label.setForeground(Color.RED);
		label.setBounds(119, 264, 46, 14);
		contentPane.add(label);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(303, 293, 76, 70);
		contentPane.add(lblNewLabel_2);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(10, 341, 89, 23);
		contentPane.add(btnIniciar);

		JButton btnParar = new JButton("Parar");
		btnParar.setForeground(Color.RED);
		btnParar.setBackground(Color.RED);
		btnParar.setBounds(109, 341, 89, 23);
		contentPane.add(btnParar);
	}
}
