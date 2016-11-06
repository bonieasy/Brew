package model;

import java.util.*;
public class Vendas {

	int numeroVenda;
	Date dataVenda, dataEntrega;
	String produtos; 
		
	//Receber e devolver as variaveis
	//Numero Venda 
	public void setNumeroVenda (int numeroVenda){
		this.numeroVenda = numeroVenda; 
	}
	
	public int getNumeroVenda (){
		return numeroVenda; 
	}
	
	//Data da venda
	public void setDataVenda (Date dataVenda){
		this.dataVenda = dataVenda;
	}
	
	public Date getDataVenda() {
		return dataVenda; 
	}
	
	//Data Entrega
	public void setDataEntrega (Date dataEntrega){
		this.dataEntrega = dataEntrega;
	}
	
	public Date getDataentrega (){
		return dataEntrega; 
	}
	
	//Produtos
	public void setProdutos (String produtos){
		this.produtos = produtos; 
	}
	
	public String getProdutos (){
		return produtos; 
	}
}



