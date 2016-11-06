package model;

public class Fornecedor {

		String nomeFornecedor, enderecoFornecedor, cidadeFornecedor, estadoFornecedor, paisFornecedor;
		int cnpjFornecedor, telefoneFornecedor; 
		
		//Receber e devolver as variaveis
		//nome fornecedor
				
		public void setNomeForncecedor(String nomeFornecedor){
			this.nomeFornecedor = nomeFornecedor;  
		}
			
		public String getNomeFornecedor(){
			return nomeFornecedor; 
		}
		
		//endereco fornecedor
		public void setEnderecoFornecedor(String enderecoFornecedor){
			this.enderecoFornecedor = enderecoFornecedor; 
		}
			
		public String getEnderecoFornecedor(){
			return enderecoFornecedor; 
		}
				
		//cidade fornecedor
		public void setCidadeFornecedor(String cidadeFornecedor){
			this.cidadeFornecedor = cidadeFornecedor; 
		}
			
		public String getcidadeFornecedor(){
			return cidadeFornecedor; 
		}
				
		//estado fornecedor
		public void setEstadoFornecedor(String estadoFornecedor){
			this.estadoFornecedor = estadoFornecedor; 
		}
			
		public String getEstadoFornecedor(){
			return estadoFornecedor; 
		}
				
		//país fornecedor
		public void setPaisFornecedor(String paisFornecedor){
			this.paisFornecedor = paisFornecedor; 
		}
			
		public String getPaisFornecedor(){
			return paisFornecedor; 
		}
		
		//CNPJ fornecedor
		public void setCnpjFornecedor(int cnpjFornecedor){
			this.cnpjFornecedor = cnpjFornecedor; 
		}
			
		public int getCnpjFornecedor(){
			return cnpjFornecedor; 
		}
				
		//telefone fornecedor
		public void setTelefoneFornecedor(int telefoneFornecedor){
			this.telefoneFornecedor = telefoneFornecedor; 
		}

}
