package com.curso.spring.logtabla;

import java.util.ArrayList;
import java.util.HashMap;

public class Registro {
	
	
	private static HashMap<String, String> miRegistro;

	static {
		miRegistro = new HashMap<String,String>();
		miRegistro.put("Fried","1230");
		miRegistro.put("Baum","8450");
		miRegistro.put("Schulz","6820");
		miRegistro.put("Wexler","9760");
		miRegistro.put("Freud","3510");
	}

	public static ArrayList<Usuario>  getMiResgistro() {
		ArrayList<Usuario> nuevaLista = new ArrayList<Usuario>();
		for (String instancia : Registro.miRegistro.keySet() )
			nuevaLista.add(new Usuario(instancia, (String)Registro.miRegistro.get(instancia)));
		return nuevaLista;
	}

	public static void setMiResgistro(Usuario nuevo) {
		Registro.miRegistro.put(nuevo.getNombre(), nuevo.getPass());
	}
	

}
