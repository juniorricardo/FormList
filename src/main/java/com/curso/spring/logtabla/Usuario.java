package com.curso.spring.logtabla;

/**
 * 
 * @author Cina
 *	Esta clase POJO, sera utilizada para capturar y mostrar datos en la vista
 */

public class Usuario {
	
	private String nombre;
	private String pass;
	
	
	public Usuario() {}
	
	public Usuario(String nombre, String pass) {
		super();
		this.nombre = nombre;
		this.pass = pass;
	}
	
	//Getters y Setters
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
