package model;

public class Funcionarios {
	
		String nomeFuncionario, enderecoFuncionario, cidadeFuncionario, estadoFuncionario, paisFuncionario;
		int cpfFuncionario, rgFuncionario, numeroCtps; 

		//Receber e devolver as variaveis
		//nome funcionario
		public void setNomeFuncionario(String nomeFuncionario){
			this.nomeFuncionario = nomeFuncionario; 
		}
		
		public String getNomeFuncionario(){
			return nomeFuncionario; 
		}
			
		//endereco Funcionario
		public void setEnderecoFuncionario(String enderecoFuncionario){
			this.enderecoFuncionario = enderecoFuncionario; 
		}
		
		public String getEnderecoFuncionario(){
			return enderecoFuncionario; 
		}
			
		//cidade Funcionario
 		public void setCidadeFuncionario(String cidadeFuncionario){
			this.cidadeFuncionario = cidadeFuncionario; 
		}
		
		public String getcidadeFuncionario(){
			return cidadeFuncionario; 
		}
			
		//estado Funcionario
		public void setEstadoFuncionario(String estadoFuncionario){
			this.estadoFuncionario = estadoFuncionario; 
		}
		
		public String getEstadoFuncionario(){
			return estadoFuncionario; 
		}
			
		//país Funcionario
		public void setPaisFuncionario(String paisFuncionario){
			this.paisFuncionario = paisFuncionario; 
		}
		
		public String getPaisFuncionario(){
			return paisFuncionario; 
		}
		
		//CPF
		public void setCpfFuncionario(int cpfFuncionario){
			this.cpfFuncionario = cpfFuncionario; 
		}
			
		public int getCpfFuncionario(){
			return cpfFuncionario; 
		}
			
		//RG
		public void setRgFuncionario(int rgFuncionario){
			this.rgFuncionario = rgFuncionario; 
		}
			
		public int getRgFuncionario(){
			return rgFuncionario; 
		}
		
		//CTPS
		public void setNumeroCtpsFuncionario(int numeroCtps){
			this.numeroCtps = numeroCtps; 
		}
					
		public int setNumeroCtpsFuncionario(){
			return numeroCtps; 
		}
}
