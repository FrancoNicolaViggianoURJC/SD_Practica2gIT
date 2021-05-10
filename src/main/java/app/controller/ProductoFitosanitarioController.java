package app.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.entity.ProductoFitosanitario;
import app.repository.ProductoFitosanitarioRepository;
@RestController
public class ProductoFitosanitarioController {

	@Autowired
	private ProductoFitosanitarioRepository repoProdFit;
	
	@RequestMapping(value = "/getProductosFitosanitarios",method = RequestMethod.GET)
	public List<ProductoFitosanitario> getSustActivas() {
		return repoProdFit.findAll();
	}
}
