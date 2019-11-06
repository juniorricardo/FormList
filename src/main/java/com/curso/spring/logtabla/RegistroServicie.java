package com.curso.spring.logtabla;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class RegistroServicie {

	public void setRegistro(Usuario nuevo) {
		Registro.setMiResgistro(nuevo);
	}

	public ArrayList<Usuario> getRegistroLista() {
		return Registro.getMiResgistroLista();
	}

	public boolean existeRegistro(Usuario usuario) {
		return Registro.getMiResgistro().getOrDefault(usuario.getNombre(), "no existe").equals(usuario.getPass());
	}

	public boolean existeUsuario(Usuario usuario) {
		return Registro.getMiResgistro().containsKey(usuario.getNombre());
	}

}
