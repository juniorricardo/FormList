package com.curso.spring.logtabla;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;


@Service
public class RegistroServicie {
	
	public void setRegistro(Usuario nuevo) {
		Registro.setMiResgistro(nuevo);
	}
	
	public ArrayList<Usuario> getRegistroLista() {
		return Registro.getMiResgistroLista();
	}
	
	public boolean existe(Usuario usuario) {
		return Registro.getMiResgistro().getOrDefault(usuario.getNombre(), "no existe").equals(usuario.getPass());
	}

}
