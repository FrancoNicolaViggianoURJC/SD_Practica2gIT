package app.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Especie;
import app.entity.Plaga;
import app.repository.EspecieRepository;

@RestController
public class EspecieController {

	
	@Autowired
	private EspecieRepository repoEspecie;
	
	@RequestMapping(value = "/getEspecies",method = RequestMethod.GET)
	public List<Especie> getEspecies() {
		return repoEspecie.findAll();
	}

	@RequestMapping(value = "/getEspecies/{id}/listaPlagas",method = RequestMethod.GET)
	public List<Plaga> getPlagas(@PathVariable("id") Long id) {
		Especie especie = repoEspecie.findById(id).get();
		return especie.getListaPlagas();
	}
}
