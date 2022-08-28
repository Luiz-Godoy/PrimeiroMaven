package com.etec.PrimeiroMaven;

public class Aluno extends Pessoa {
	private boolean fumante = false;
	
	public Aluno() {
		
	}
	
	// Retorna o valor de fumante
	public boolean isFumante() {
		return fumante;
	}
	
	// Construtor do parâmetro fumante a ser definido
	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
}
