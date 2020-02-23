package com.openwebinars.spring.hellospring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Motor {

	private Bujia bujia;
	
	private List<Bujia> listaBujias;
	
	private Map<String,Bujia> mapaBujias; 
	
	private Set<Bujia> setBujias;
	
	private Properties properties;
	
	public Motor() {
		
	}
	
	public Motor(Bujia bujia) {
		this.bujia = bujia;
	}

	//GETTERS SETTERS
	public Bujia getBujia() {
		return bujia;
	}

	public void setBujia(Bujia bujia) {
		this.bujia = bujia;
	}
	
	public List<Bujia> getListaBujias() {
		return listaBujias;
	}
	
	public void setListaBujias(List<Bujia> listaBujias) {
		this.listaBujias = listaBujias;
	}
	
	public Map<String, Bujia> getMapaBujias() {
		return mapaBujias;
	}

	public void setMapaBujias(Map<String, Bujia> mapaBujias) {
		this.mapaBujias = mapaBujias;
	}
	
	public Set<Bujia> getSetBujias() {
		return setBujias;
	}

	public void setSetBujias(Set<Bujia> setBujias) {
		this.setBujias = setBujias;
	}
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Motor [bujia=" + bujia + ", listaBujias=" + listaBujias + ", mapaBujias=" + mapaBujias + ", setBujias="
				+ setBujias + "]";
	}

	
	
	
	
	
	
	
}
