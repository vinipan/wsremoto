package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@RestController
@CrossOrigin("*")

public class UsuarioController {
	
	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/usuarios")
	public List<Usuario> getAll()
	{
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		return lista;
		
	}
	
	@GetMapping("/usuario/{cod}")
	public Usuario getUser(@PathVariable int cod) {
		Usuario objeto = dao.findById(cod).orElse(null);
		return objeto;
		
	}
	
	

}
