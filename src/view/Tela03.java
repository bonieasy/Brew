package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

public class Tela03 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6302290582798944279L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela03 frame = new Tela03();
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
	public Tela03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 472);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 86, 46, 14);

		textField = new JTextField();
		textField.setBounds(55, 83, 455, 20);
		textField.setColumns(10);

		JLabel lblOg = new JLabel("OG");
		lblOg.setBounds(31, 138, 35, 14);

		JLabel lblFg = new JLabel("FG");
		lblFg.setBounds(31, 163, 35, 14);

		JLabel lblIbu = new JLabel("IBU");
		lblIbu.setBounds(31, 189, 35, 14);

		JLabel lblAbv = new JLabel("ABV");
		lblAbv.setBounds(31, 212, 35, 14);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(60, 134, 45, 20);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(60, 159, 45, 20);

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(60, 184, 45, 20);

		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(60, 209, 45, 20);
		contentPane.setLayout(null);
		contentPane.add(spinner);
		contentPane.add(spinner_1);
		contentPane.add(spinner_2);
		contentPane.add(spinner_3);
		contentPane.add(lblIbu);
		contentPane.add(lblNewLabel);
		contentPane.add(textField);
		contentPane.add(lblAbv);
		contentPane.add(lblFg);
		contentPane.add(lblOg);

		textField_1 = new JTextField();
		textField_1.setBounds(139, 134, 123, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblLpulo = new JLabel("L\u00FApulo");
		lblLpulo.setBounds(20, 256, 46, 14);
		contentPane.add(lblLpulo);

		textField_2 = new JTextField();
		textField_2.setBounds(84, 253, 192, 72);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblComentrio = new JLabel("Coment\u00E1rio");
		lblComentrio.setBounds(10, 337, 114, 14);
		contentPane.add(lblComentrio);

		textField_3 = new JTextField();
		textField_3.setBounds(84, 335, 192, 72);
		textField_3.setColumns(10);
		contentPane.add(textField_3);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(286, 365, 89, 23);
		contentPane.add(btnSalvar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(286, 399, 89, 23);
		contentPane.add(btnCancelar);

		textField_4 = new JTextField();
		textField_4.setBounds(139, 160, 123, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(139, 187, 123, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(139, 213, 123, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblReceita = new JLabel("Nova Receita");
		lblReceita.setVerticalAlignment(SwingConstants.TOP);
		lblReceita.setBounds(0, 0, 517, 60);
		lblReceita.setOpaque(true); // Deixa a label opaca.
		lblReceita.setBackground(Color.GRAY); // Muda a cor de fundo.
		lblReceita.setForeground(Color.WHITE);
		lblReceita.setHorizontalAlignment(SwingConstants.LEFT);
		lblReceita.setFont(new Font("Tahoma", Font.BOLD, 58));
		contentPane.add(lblReceita);

		JPanel Indices = new JPanel();
		Indices.setBounds(10, 114, 114, 135);
		Indices.setBackground(Color.WHITE);
		Indices.setBorder(new TitledBorder(null, "Indices", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(Indices);
		Indices.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(128, 114, 148, 134);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "Ingredientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(278, 115, 232, 108);
		panel_1.setBorder(new TitledBorder(null, "Tempos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Fervura");
		lblNewLabel_3.setBounds(10, 51, 81, 14);
		panel_1.add(lblNewLabel_3);

		JLabel lblBrassagem = new JLabel("Brassagem");
		lblBrassagem.setBounds(10, 23, 84, 14);
		panel_1.add(lblBrassagem);

		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(100, 20, 46, 20);
		panel_1.add(spinner_10);

		JLabel lblFermentao = new JLabel("Fermenta\u00E7\u00E3o");
		lblFermentao.setBounds(10, 79, 78, 17);
		panel_1.add(lblFermentao);

		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(100, 76, 46, 20);
		panel_1.add(spinner_6);

		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(99, 48, 46, 20);
		panel_1.add(spinner_5);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(278, 229, 232, 125);
		panel_2.setBorder(new TitledBorder(null, "Rampa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(107, 23, 1, 1);
		panel_2.add(desktopPane);

		JLabel lblTempoDeRepouso = new JLabel("Tempo");
		lblTempoDeRepouso.setBounds(10, 26, 98, 14);
		panel_2.add(lblTempoDeRepouso);

		JLabel lblNewLabel_4 = new JLabel("Varia\u00E7\u00E3o");
		lblNewLabel_4.setBounds(11, 49, 97, 14);
		panel_2.add(lblNewLabel_4);

		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setBounds(10, 73, 98, 14);
		panel_2.add(lblTemperatura);

		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(103, 23, 45, 20);
		panel_2.add(spinner_7);

		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(103, 46, 45, 20);
		panel_2.add(spinner_8);

		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(103, 70, 45, 20);
		panel_2.add(spinner_9);

		JLabel lblCelsius = new JLabel("*Celsius");
		lblCelsius.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblCelsius.setForeground(Color.LIGHT_GRAY);
		lblCelsius.setBounds(164, 71, 46, 14);
		panel_2.add(lblCelsius);

		JLabel lblVezes = new JLabel("Vezes");
		lblVezes.setForeground(Color.LIGHT_GRAY);
		lblVezes.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblVezes.setBounds(165, 47, 46, 14);
		panel_2.add(lblVezes);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(430, 352, 77, 72);
		contentPane.add(lblNewLabel_1);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { spinner, lblNewLabel_4,
				spinner_1, spinner_2, spinner_3, lblIbu, desktopPane, lblNewLabel, textField, lblAbv, lblFg, lblOg,
				textField_1, lblNewLabel_3, lblFermentao, spinner_5, spinner_6, lblLpulo, textField_2, lblComentrio,
				textField_3, btnSalvar, btnCancelar, lblTempoDeRepouso, lblTemperatura, spinner_7, spinner_8, spinner_9,
				textField_4, textField_5, textField_6, lblReceita }));
	}
}
