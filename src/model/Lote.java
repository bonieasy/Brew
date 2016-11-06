package model;

import java.util.*;
public class Lote {


	int numeroLote;
	float indiceOg, indiceFg, indiceIbu, indiceAbv;
	String nomeReceita; 
	Date dataInicio, dataFim, dataEnvase, dataInicioFermentacao;

	//Receber e devolver as variaveis
	//Numero do Lote
	public void setNumeroLote(int numeroLote){
		this.numeroLote = numeroLote; 
	}
	
	public int getNumeroLote(){
		return numeroLote;
	}
	
	// Indice OG
	public void setIndiceOgObtido (float indiceOg){
		this.indiceOg = indiceOg; 
	}
	
	public float getIndiceOgObtido(){
		return indiceOg;
	}
	
	//Indice FG
	public void setIndiceFgObtido (float indiceFg){
		this.indiceFg = indiceFg; 
	}
	
	public float getIndiceFgObtido(){
		return indiceFg;
	}
	
	//Indice IBU
	public void setIndiceIbuObtido (float indiceIbu){
		this.indiceIbu = indiceIbu; 
	}
	
	public float getIndiceIbuObtido(){
		return indiceIbu;
	}
	
	//Indice ABV
	public void setIndiceAbvObtido (float indiceAbv){
		this.indiceAbv = indiceAbv; 
	}
	
	public float getIndiceAbvObtido(){
		return indiceAbv;
	}
	
	//Nome da receita
	public void setNomeReceitaPedido (String nomeReceita){
		this.nomeReceita = nomeReceita; 
	}
	
	public String getNomeReceitaPedido(){
		return nomeReceita;
	}
	
	//Data Inicio
	public void setDataInicio (Date dataInicio){
		this.dataInicio = dataInicio; 
	}
	
	public Date getDataInicio(){
		return dataInicio; 
	}
	
	//Data Fim
	public void setDataFim (Date dataFim){
		this.dataFim = dataFim;
	}
	
	public Date getDataFim (){
		return dataFim; 
	}
	
	//Data Envase 
	public void setDataEnvase (Date dataEnvase){
		this.dataEnvase = dataEnvase; 
	}
	
	public Date getDataEnvase (){
		return dataEnvase; 
	}
	
	//Data Inicio Fermentacao
	public void setDataInicioFermentacao (Date dataInicioFermentacao){
		this.dataInicioFermentacao = dataInicioFermentacao; 
	}
		
	public Date getDataInicioFermentacao(){
		return dataInicioFermentacao; 
	}
}




