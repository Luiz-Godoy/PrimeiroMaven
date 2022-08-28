package com.etec.util;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTime {
	private String data;
	private String hora;
	
	public DayTime() {
		Date dataHoraAtual = new Date();
		
		this.setData(new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual));
		this.setHora(new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual));
		
	}
	
	// Retorna a data
	public String getData() {
		return data;
	}
	
	// Construtor de retorno da data
	public void setData(String data) {
		this.data = data;
	}
	
	// Retorna a hora
	public String getHora() {
		return hora;
	}
	
	// Construtor de retorno da data
	public void setHora(String hora) {
		this.hora = hora;
	}
}
