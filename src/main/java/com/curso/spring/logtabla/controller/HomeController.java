package com.curso.spring.logtabla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.spring.logtabla.RegistroServicie;
import com.curso.spring.logtabla.Usuario;


@Controller
public class HomeController {
	
	@Autowired
	private RegistroServicie miRegistro;
	
	@GetMapping("/nuevo")
	public String logForm(Model modelo) {
		modelo.addAttribute("registro", new Usuario());
		return "nuevo";
	}
	
	@PostMapping("/nuevo")
	public String setRegistro(@ModelAttribute Usuario usuario ,Model modelo) {
//		
//		for (Usuario index : miRegistro.getRegistro()) {
//			if(index.getNombre() == usuario.getNombre() && )
//		}
		miRegistro.setRegistro(usuario);
		modelo.addAttribute("listUsuarios", miRegistro.getRegistro());
		return "lista";
	}
	
	@GetMapping("/lista")
	public String getLista(Model modelo) {
		modelo.addAttribute("listUsuarios", miRegistro.getRegistro());
		return "lista";
	}
	
//	@PostMapping("/lista")
//	public String cargar() {
//		
//	}
	
	
	
}
