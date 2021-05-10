package app.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Plaga;
import app.repository.PlagasRepository;
import app.entity.SustActiva;
@RestController
public class PlagasController {

	@Autowired
	private PlagasRepository repoPlagas;
	
	@RequestMapping(value = "/getPlagas",method = RequestMethod.GET)
	public List<Plaga> getPlagas() {
		return repoPlagas.findAll();
	}

	@RequestMapping(value = "/getPlagas/{id}/SustActiva",method = RequestMethod.GET)
	public List<SustActiva> getSustActivas(@PathVariable("id") Long id) {
		Plaga plaga = repoPlagas.findById(id).get();
		return plaga.getSustanciasActivas();
	}
}
