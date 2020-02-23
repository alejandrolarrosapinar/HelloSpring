package com.openwebinars.spring.hellospring;

public class Vehiculo {

	private Motor motor;
	private String nombre;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(Motor motor, String nombre) {
		this.motor = motor;
		this.nombre = nombre;
	}

	//GETTERS SETTERS
	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [motor=" + motor + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
}
