package com.curso.spring.logtabla;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


@Service
public class RegistroServicie {
	
	public void setRegistro(Usuario nuevo) {
		Registro.setMiResgistro(nuevo);
	}
	
	public ArrayList<Usuario> getRegistro() {
		return Registro.getMiResgistro();
	}
	
//	public boolean existe(Usuario usuario) {
//		for (Usuario iterable_element : iterable) {
//			
//		}
//	}

}
