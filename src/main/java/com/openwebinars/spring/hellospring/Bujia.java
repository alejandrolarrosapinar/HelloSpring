package com.openwebinars.spring.hellospring;

import java.util.List;

public class Bujia {

	private double precio;
	
	public Bujia() {}
	
	public Bujia(double precio) {
		this.precio = precio;
	}

	
	//GETTERS SETTERS
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Bujia [precio=" + precio + "]";
	}

	
	
}
