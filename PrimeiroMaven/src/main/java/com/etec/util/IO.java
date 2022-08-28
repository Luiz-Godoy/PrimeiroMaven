package com.etec.util;

import javax.swing.JOptionPane;

public class IO {
	private String texto;
	
	public IO() {
		
	}
	
	// Retorna o texto
	public String getTexto() {
		return texto;
	}
	
	// Construtor de retorno do texto
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void exibirTexto() {
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public String digitarTexto(String mensagem) {
		this.setTexto(JOptionPane.showInputDialog(mensagem));
		return this.getTexto();
	}
	
}
