package app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import app.repository.CategoriaRepository;
import app.repository.EspecieRepository;
import app.repository.PlagasRepository;
import app.repository.ProductoFitosanitarioRepository;
import app.repository.SustActivaRepository;

@Controller
public class MainController {
	
	@Autowired
	CategoriaRepository repoCategoria;
	@Autowired
	EspecieRepository repoEspecie;
	@Autowired
	PlagasRepository repoPlaga;
	@Autowired
	ProductoFitosanitarioRepository repoProducto;
	@Autowired
	SustActivaRepository repoSustancias;
	
	@GetMapping("/")
	public String main(Model model) {
		//REVISAR LOS ATRIBUTOS ID DE CADA CLASE, ESTAN EN PUBLIC!
		model.addAttribute("Categoria", repoCategoria.findAll());
		return "t_listarProductos";
	}

}
