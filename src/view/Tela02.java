package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class Tela02 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela02 frame = new Tela02();
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
	public Tela02() {
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);

		JButton btnReceitas = new JButton("Receitas");
		btnReceitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela04 f = new Tela04(); 
				f.setVisible(true);
			}
		});
		btnReceitas.setHorizontalAlignment(SwingConstants.RIGHT);
		btnReceitas.setIcon(null);
		btnReceitas.setBackground(Color.LIGHT_GRAY);
		btnReceitas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnReceitas.setBounds(10, 87, 145, 61);
		getContentPane().add(btnReceitas);

		JButton btnRelatrios = new JButton("Relat\u00F3rios");
		btnRelatrios.setBackground(Color.LIGHT_GRAY);
		btnRelatrios.setHorizontalAlignment(SwingConstants.RIGHT);
		btnRelatrios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRelatrios.setBounds(165, 158, 144, 61);
		getContentPane().add(btnRelatrios);

		JButton btnPedidos = new JButton("Pedidos");
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela08 f = new Tela08(); 
				f.setVisible(true);
			}
		});
		btnPedidos.setIcon(null);
		btnPedidos.setBackground(Color.LIGHT_GRAY);
		btnPedidos.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPedidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPedidos.setBounds(10, 158, 145, 61);
		getContentPane().add(btnPedidos);

		JButton btnLotes = new JButton("Lotes");
		btnLotes.setBackground(Color.LIGHT_GRAY);
		btnLotes.setHorizontalAlignment(SwingConstants.RIGHT);
		btnLotes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLotes.setBounds(10, 230, 145, 59);
		getContentPane().add(btnLotes);

		JLabel lblMenu = new JLabel("  Menu");
		lblMenu.setVerticalAlignment(SwingConstants.TOP);
		lblMenu.setOpaque(true);
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 58));
		lblMenu.setBackground(Color.GRAY);
		lblMenu.setBounds(2, 0, 453, 60);
		getContentPane().add(lblMenu);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(362, 88, 83, 82);
		getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Vendedores");
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(165, 230, 144, 59);
		getContentPane().add(btnNewButton);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setHorizontalAlignment(SwingConstants.RIGHT);
		btnClientes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClientes.setBackground(Color.LIGHT_GRAY);
		btnClientes.setBounds(165, 87, 145, 61);
		getContentPane().add(btnClientes);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 343);
	}
}
