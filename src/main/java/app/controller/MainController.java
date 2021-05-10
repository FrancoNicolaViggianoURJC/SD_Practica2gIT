package app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import app.repository.ProductoFitosanitarioRepository;

@Controller
public class MainController {

	ProductoFitosanitarioRepository repoProductos;
	
	@GetMapping("/")
	public String main(Model model) {
		
		model.addAttribute("Productos", repoProductos.findAll());
		return "t_listarProductos";
	}

}
