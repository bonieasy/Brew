package model;

import javax.swing.JOptionPane; 
public class NovoCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		String aux = JOptionPane.showInputDialog("Digite o nome do cliente: ");
		String nome  = aux; 
		c1.setNomeCliente(nome); 
		
		JOptionPane.showMessageDialog(null, "Nome: " + c1.getNomeCliente());
		
	}

}
