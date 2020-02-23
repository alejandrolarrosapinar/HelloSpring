package com.openwebinars.spring.hellospring;

public class Mundo {

	private String saludo;

	public Mundo () {
		
	}
	
	public Mundo (String saludo) {
		this.saludo = saludo;
	}
	
	//GETTERS Y SETTERS
	public String getMensaje() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
