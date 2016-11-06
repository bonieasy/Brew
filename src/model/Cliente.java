package model;

public class Cliente {
	
		String nomeCliente, enderecoCliente, cidadeCliente, estadoCliente, paisCliente; 
		int cpfCliente, telefoneCliente, idadeCliente;
		
		//Receber e devolver as variaveis
		//nome
		public void setNomeCliente(String nomeCliente){
			this.nomeCliente = nomeCliente; 
		}
	
		public String getNomeCliente(){
			return nomeCliente; 
		}
		
		//endereco
		public void setEnderecoCliente(String enderecoCliente){
			this.enderecoCliente = enderecoCliente; 
		}
	
		public String getEnderecoCliente(){
			return enderecoCliente; 
		}
		
		//cidade
		public void setCidadeCliente(String cidadeCliente){
			this.cidadeCliente = cidadeCliente; 
		}
	
		public String getcidadeCliente(){
			return cidadeCliente; 
		}
		
		//estado
		public void setEstadoCliente(String estadoCliente){
			this.estadoCliente = estadoCliente; 
		}
	
		public String getEstadoCliente(){
			return estadoCliente; 
		}
		
		//país
		public void setPaisCliente(String paisCliente){
			this.paisCliente = paisCliente; 
		}
	
		public String getPaisCliente(){
			return paisCliente; 
		}
		
		//idade
		public void setIdadeCliente(int idadeCliente){
			this.idadeCliente = idadeCliente; 
		}
	
		public int getIdadeCliente(){
			return idadeCliente; 
		}
		
		//CPF
		public void setCpfCliente(int cpfCliente){
			this.cpfCliente = cpfCliente; 
		}
	
		public int getCpfCliente(){
			return cpfCliente; 
		}
		
		//telefone
		public void setTelefoneCliente(int telefoneCliente){
			this.telefoneCliente = telefoneCliente; 
		}
	
		public int getTelefoneCliente(){
			return telefoneCliente; 
		}
}
