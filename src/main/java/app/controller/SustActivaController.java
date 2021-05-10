package app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.entity.ProductoFitosanitario;
import app.entity.SustActiva;
import app.repository.SustActivaRepository;
@RestController
public class SustActivaController {

	
	@Autowired
	private SustActivaRepository repoSustActiva;
	
	@RequestMapping(value = "/getSustActivas",method = RequestMethod.GET)
	public List<SustActiva> getSustActivas() {
		return repoSustActiva.findAll();
	}

	@RequestMapping(value = "/getSustActivas/{id}/ProductoFitosanitario",method = RequestMethod.GET)
	public List<ProductoFitosanitario> getSustActivas(@PathVariable("id") Long id) {
		SustActiva sustActiva = repoSustActiva.findById(id).get();
		return sustActiva.getListaProdFit();
	}
}
