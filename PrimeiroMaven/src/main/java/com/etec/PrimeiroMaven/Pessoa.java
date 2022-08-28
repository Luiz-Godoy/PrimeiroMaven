package com.etec.PrimeiroMaven;

public class Pessoa {
	private String nome = "";
	private int idade = 0;
	
	public Pessoa() {
		
	}
	
	// Retorna o nome
	public String getNome() {
		return nome;
	}
	
	// Construtor do Nome a ser definido
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Retorna a idade
	public int getIdade() {
		return idade;
	}
	
	// Construtor da Idade a ser definida
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
