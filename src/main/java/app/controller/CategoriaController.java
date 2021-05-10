package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.repository.CategoriaRepository;
import app.entity.Categoria;
import app.entity.Especie;

@RestController
public class CategoriaController {

	@Autowired
	private CategoriaRepository repoCategoria;
	
	@RequestMapping(value = "/getCategorias",method = RequestMethod.GET)
	public List<Categoria> getCategorias() {
		return repoCategoria.findAll();
	}

	@RequestMapping(value = "/getCategoria/{id}/Especie",method = RequestMethod.GET)
	public List<Especie> getEspecies(@PathVariable("id") Long id) {
		Categoria categoria = repoCategoria.findById(id).get();
		return categoria.getListaEspecies();
	}
	
	
}
