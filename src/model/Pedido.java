package model;

import java.util.*;
public class Pedido {

	Date dataPedido, dataEntrega;
	String receitaProduto; 
	
	//Receber e devolver as variaveis
	//Data Pedido
		public void setDataPedido (Date dataPedido){
			this.dataPedido = dataPedido; 
		}
			
		public Date getDataPedido(){
			return dataPedido; 
		}
	
	//Data Entrega
		public void setDataEntrega (Date dataEntrega){
			this.dataEntrega = dataEntrega; 
		}
					
		public Date getDataEntrega(){
			return dataEntrega; 
		}
		
	//Falta colocar o get receita (pegar a receita do banco de dados)
}
