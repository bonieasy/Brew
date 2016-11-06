package model;

public class Receita {

	String nomeReceita, ingredientes, lupulo, comentario; 
	float indiceOg, indiceFg, indiceIbu, indiceAbv, tempoBrassagem, tempoFervura, tempoFermentacao, tempoRepouso, tempoVariacao, temperaturaRampa;
		
	//Receber e devolver as variaveis
	//Nome receita
	
	public void setNomeReceita (String nomeReceita){
		this.nomeReceita = nomeReceita;
	}
	
	public String getNomeReceita(){
		return nomeReceita; 
	}
	
	//Ingredientes
	
	public void setIngredientes (String ingredientes){
		this.ingredientes = ingredientes; 
	}
	
	public String getIngredientes(){
		return ingredientes; 
	}
	
	//lupulo
	
	public void setLupulo (String lupulo){
		this.lupulo = lupulo; 
	}
	
	public String getLupulo(){
		return lupulo; 
	}
	
	//comentario
	
	public void setComentario (String comentario){
		this.comentario = comentario; 
	}
	
	public String getComentario(){
		return comentario; 
	}
	
	//Indice OG
	
	public void setIndiceOG (float indiceOg){
		this.indiceOg = indiceOg; 
	}
	
	public float getIndiceOG (){
		return indiceOg; 
	}
	
	//Indice FG
	
	public void setIndiceFG (float indiceFg){
		this.indiceFg = indiceFg; 
	}
	
	public float getIndiceFG (){
		return indiceFg; 
	}
	
	//Indice IBU
	
	public void setIndiceIBU (float indiceIbu){
		this.indiceIbu = indiceIbu; 
	}
	
	public float getIndiceIbu (){
		return indiceIbu; 
	}
	
	//Indice ABV
	
	public void setIndiceABV (float indiceAbv){
		this.indiceAbv = indiceAbv; 
	}
	
	public float getIndiceAbv (){
		return indiceAbv; 
	}
	
	//Tempo de Brassagem 
	
	public void setTempoBrassagem (float tempoBrassagem){
		this.tempoBrassagem = tempoBrassagem; 
	}
	
	public float getTempoBrassagem(){
		return tempoBrassagem; 
	}
	
	//Tempo de Fervura 
	
	public void setTempoFervura (float tempoFervura){
		this.tempoFervura = tempoFervura; 
	}
		
	public float getTempoFervura(){
		return tempoFervura; 
	}
	
	//Tempo de Fermentação
	
	public void setTempoFermentacao (float tempoFermentacao){
		this.tempoFermentacao = tempoFermentacao; 
	}
		
	public float getTempoFermentacao(){
		return tempoFermentacao; 
	}
	
	//Tempo de repouso da rampa 
	
	public void setTempoRepouso (float tempoRepouso){
		this.tempoRepouso = tempoRepouso; 
	}
		
	public float getTempoRepouso(){
		return tempoRepouso; 
	}
	
	//Tempo de variação da rampa
	
	public void setTempoVariacao (float tempoVariacao){
		this.tempoVariacao = tempoVariacao; 
	}
			
	public float getTempoVariacao(){
		return tempoVariacao; 
	}
	
	//Temperatura da Rampa
	
	public void setTemperaturaRampa(float temperaturaRampa){
		this.temperaturaRampa = temperaturaRampa; 
	}
	
	public float getTemperaturaRampa(){
		return temperaturaRampa; 
	}
	
	
	
	
}
