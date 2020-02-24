package com.openwebinars.spring.hellospring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;;


public class Saludo implements InitializingBean,DisposableBean {

	private String saludo;

	public Saludo () {
		
	}
	
	public Saludo (String saludo) {
		this.saludo = saludo;
	}
	
	//Estos eventos se aplican cuando se crea o se destruye el bean
	public void destroy() throws Exception {
		System.out.println("El bean Saludo se ha destruido");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("El bean Saludo se acaba de iniciar");
	}
	
	public void inicar() {
		System.out.println("Iniciando desde el xml");
	}
	
	public void destruir() {
		System.out.println("Destruyendo desde el xml");
	}
	
	@PreDestroy
	public void iniciarAnotaciones() {
		System.out.println("Predestroy anotaciones");
	}
	
	@PostConstruct
	public void destruirAnotaciones() {
		System.out.println("PostConstruct anotaciones");
	}
	
	//GETTERS Y SETTERS
	public String getMensaje() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	
}
