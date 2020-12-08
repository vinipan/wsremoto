package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.dao.ArtistaDAO;

@RestController
@CrossOrigin("*")

public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
	
	@GetMapping("/artistas")
	public List<Artista> getAll()
	{
		List<Artista> lista = (List<Artista>) dao.findAll();
		return lista;
		
	}
	
	@GetMapping("/artista/{cod}")
	public Artista getArtista(@PathVariable int cod) {
		Artista objeto = dao.findById(cod).orElse(null);
		return objeto;
		
	}
	
	@GetMapping("/artista/del/{cod}")
	public String delArtista (@PathVariable int cod) {
		try {
			Artista objeto = dao.findById(cod).orElse(null);			
			dao.deleteById(cod);
			return "O SEGUINTE REGISTRO FOI APAGADO: \n" + objeto; 
		}
		
		catch (Exception erro) {
			return "ALGO DEU RUIM";
		}
	}
	
	@GetMapping("/artista/add/{nam}.{nac}")
	public String addArtista (@PathVariable String nam, @PathVariable String nac) {
		Artista objArtista = new Artista (0,nam,nac);
		dao.save(objArtista);		
		return "";
	}

}
