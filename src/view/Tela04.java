package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLayeredPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela04 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela04 frame = new Tela04();
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
	public Tela04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 351);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(92, 126, 122, -71);
		contentPane.add(layeredPane);

		JLabel lblReceitas = new JLabel("Receitas");
		lblReceitas.setBounds(0, 0, 528, 60);
		lblReceitas.setVerticalAlignment(SwingConstants.TOP);
		lblReceitas.setOpaque(true);
		lblReceitas.setHorizontalAlignment(SwingConstants.LEFT);
		lblReceitas.setForeground(Color.WHITE);
		lblReceitas.setFont(new Font("Tahoma", Font.BOLD, 58));
		lblReceitas.setBackground(Color.GRAY);
		contentPane.add(lblReceitas);

		JButton btnNovaReceita = new JButton("Nova Receita");
		btnNovaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela03 f = new Tela03();
				f.setVisible(true);
			}
		});
		btnNovaReceita.setBackground(Color.WHITE);
		btnNovaReceita.setBounds(10, 102, 114, 23);
		contentPane.add(btnNovaReceita);

		JButton btnExcluirReceita = new JButton("Excluir Receita");
		btnExcluirReceita.setBounds(10, 136, 114, 23);
		contentPane.add(btnExcluirReceita);

		JButton btnVisualizarReceita = new JButton("Visualizar");
		btnVisualizarReceita.setBounds(10, 170, 114, 23);
		contentPane.add(btnVisualizarReceita);

		JButton btnVoltarAoMenu = new JButton("Voltar ao Menu");
		btnVoltarAoMenu.setBounds(10, 204, 114, 23);
		contentPane.add(btnVoltarAoMenu);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "Receitas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(152, 105, 352, 122);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(407, 226, 83, 75);
		contentPane.add(lblNewLabel);
	}
}
