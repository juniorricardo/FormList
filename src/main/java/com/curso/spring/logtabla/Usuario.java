package com.curso.spring.logtabla;

public class Usuario {
	
	private String nombre;
	private String pass;
	
	public Usuario() {}
	public Usuario(String nombre, String pass) {
		super();
		this.nombre = nombre;
		this.pass = pass;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
