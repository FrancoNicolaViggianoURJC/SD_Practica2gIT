package app;

import app.repository.*;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.*;

@Component
public class Initializer {
	
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
	
	
	
	
	//Categoria(Long id, String nombre, List<Especie> listaEspecies, Collection<Especie> especies) 
	/*
	@PostConstruct
	public void crearCategorias(){
		
		repoCategoria.save(new Categoria())
	}
	*/
	@PostConstruct
	public void crearProductos(){
		repoProducto.save(new ProductoFitosanitario("MICROTHIOL SPECIAL DISPERSS", "http://www.prodfitosanitario/pdf/001.pdf"));
		repoProducto.save(new ProductoFitosanitario("COBRE NORDOX 50", "http://www.prodfitosanitario/pdf/002.pdf"));
		repoProducto.save(new ProductoFitosanitario("DECCOSOL-MF", "http://www.prodfitosanitario/pdf/003.pdf"));
		repoProducto.save(new ProductoFitosanitario("BASAGRAN L", "http://www.prodfitosanitario/pdf/004.pdf"));
		repoProducto.save(new ProductoFitosanitario("SP4OK", "http://www.prodfitosanitario/pdf/005.pdf"));
		repoProducto.save(new ProductoFitosanitario("MICROTOX", "http://www.prodfitosanitario/pdf/006.pdf"));
		repoProducto.save(new ProductoFitosanitario("EVER TRANSPARENTE", "http://www.prodfitosanitario/pdf/007.pdf"));
		repoProducto.save(new ProductoFitosanitario("NUFO-Z", "http://www.prodfitosanitario/pdf/008.pdf"));
		repoProducto.save(new ProductoFitosanitario("BANVEL-D", "http://www.prodfitosanitario/pdf/009.pdf"));
		repoProducto.save(new ProductoFitosanitario("QUILAN", "http://www.prodfitosanitario/pdf/010.pdf"));
		repoProducto.save(new ProductoFitosanitario("VENZAR", "http://www.prodfitosanitario/pdf/011.pdf"));
		repoProducto.save(new ProductoFitosanitario("VYDATE 10 G", "http://www.prodfitosanitario/pdf/012.pdf"));
		repoProducto.save(new ProductoFitosanitario("BELTASUR-500", "http://www.prodfitosanitario/pdf/013.pdf"));
		repoProducto.save(new ProductoFitosanitario("CAPTANA", "http://www.prodfitosanitario/pdf/014.pdf"));
		repoProducto.save(new ProductoFitosanitario("CALDO BORDELES MAC 80", "http://www.prodfitosanitario/pdf/015.pdf"));
		repoProducto.save(new ProductoFitosanitario("FULMIT OLEO L.E", "http://www.prodfitosanitario/pdf/016.pdf"));
		repoProducto.save(new ProductoFitosanitario("FULMIT", "http://www.prodfitosanitario/pdf/017.pdf"));
		repoProducto.save(new ProductoFitosanitario("APHOX", "http://www.prodfitosanitario/pdf/018.pdf"));
		repoProducto.save(new ProductoFitosanitario("CAPTAGREX 80", "http://www.prodfitosanitario/pdf/019.pdf"));
		repoProducto.save(new ProductoFitosanitario("DITIVER C PM", "http://www.prodfitosanitario/pdf/020.pdf"));
		repoProducto.save(new ProductoFitosanitario("AZUFRE FAMOLINS", "http://www.prodfitosanitario/pdf/021.pdf"));
		repoProducto.save(new ProductoFitosanitario("VOLCK VERANO", "http://www.prodfitosanitario/pdf/022.pdf"));
		repoProducto.save(new ProductoFitosanitario("NEMACUR 40 LE", "http://www.prodfitosanitario/pdf/023.pdf"));
		repoProducto.save(new ProductoFitosanitario("SANAGRICOLA WP", "http://www.prodfitosanitario/pdf/024.pdf"));
		repoProducto.save(new ProductoFitosanitario("CAPTERAN 50", "http://www.prodfitosanitario/pdf/025.pdf"));
		repoProducto.save(new ProductoFitosanitario("PELT 50 SC", "http://www.prodfitosanitario/pdf/026.pdf"));
		repoProducto.save(new ProductoFitosanitario("ACTELLIC 50-E", "http://www.prodfitosanitario/pdf/027.pdf"));
		repoProducto.save(new ProductoFitosanitario("AGRAL", "http://www.prodfitosanitario/pdf/028.pdf"));
		repoProducto.save(new ProductoFitosanitario("COBRE KEY", "http://www.prodfitosanitario/pdf/029.pdf"));
		repoProducto.save(new ProductoFitosanitario("CUPREBEL", "http://www.prodfitosanitario/pdf/030.pdf"));
		
	}
	
	@PostConstruct
	public void crearSustanciaActivas(){
		
		repoSustancias.save(new SustActiva("Digluconato de clohexidina"));
		repoSustancias.save(new SustActiva("Acido acetilpancetilico"));
		repoSustancias.save(new SustActiva("Cloruro de oxibuproca�na"));
		repoSustancias.save(new SustActiva("Yoduro de tibezonio"));
		repoSustancias.save(new SustActiva("Iodopovidona"));
		repoSustancias.save(new SustActiva("Columneritil"));
		repoSustancias.save(new SustActiva("Clothianidin)"));
		repoSustancias.save(new SustActiva("ethylenedioxy"));
		repoSustancias.save(new SustActiva("dimethanol"));
		repoSustancias.save(new SustActiva("dienyl acetate"));
		repoSustancias.save(new SustActiva("trans phenothrin"));
		repoSustancias.save(new SustActiva("cyanoacetamide"));
		repoSustancias.save(new SustActiva("Butanone peroxide"));
		repoSustancias.save(new SustActiva("Petroleum Distillate"));
		repoSustancias.save(new SustActiva("Sorbitan Oleate"));
		repoSustancias.save(new SustActiva("d-Phenothrin"));
		repoSustancias.save(new SustActiva("Prallethrin"));
		repoSustancias.save(new SustActiva("Imiprothrin"));
		repoSustancias.save(new SustActiva("Cypermethrin"));
		repoSustancias.save(new SustActiva("Picaridin"));
		repoSustancias.save(new SustActiva("Ammonium Benzoate"));
		
		List<ProductoFitosanitario> listaProductos = repoProducto.findAll();
		repoSustancias.findByNombre("Digluconato de clohexidina").getListaProdFit().add(listaProductos.get(2));
		repoSustancias.findByNombre("Digluconato de clohexidina").getListaProdFit().add(listaProductos.get(4));
		repoSustancias.findByNombre("Digluconato de clohexidina").getListaProdFit().add(listaProductos.get(6));
		repoSustancias.findByNombre("Digluconato de clohexidina").getListaProdFit().add(listaProductos.get(8));
		repoSustancias.findByNombre("Digluconato de clohexidina").getListaProdFit().add(listaProductos.get(10));
		repoSustancias.findByNombre("Digluconato de clohexidina").getListaProdFit().add(listaProductos.get(12));
		
		repoSustancias.findByNombre("Acido acetilpancetilico").getListaProdFit().add(listaProductos.get(1));
		repoSustancias.findByNombre("Acido acetilpancetilico").getListaProdFit().add(listaProductos.get(3));
		repoSustancias.findByNombre("Acido acetilpancetilico").getListaProdFit().add(listaProductos.get(5));
		repoSustancias.findByNombre("Acido acetilpancetilico").getListaProdFit().add(listaProductos.get(7));
		repoSustancias.findByNombre("Acido acetilpancetilico").getListaProdFit().add(listaProductos.get(9));
		repoSustancias.findByNombre("Acido acetilpancetilico").getListaProdFit().add(listaProductos.get(11));

		repoSustancias.save(repoSustancias.findByNombre("Digluconato de clohexidina"));
		repoSustancias.save(repoSustancias.findByNombre("Acido acetilpancetilico"));
	}
	
	@PostConstruct
	public void crearPlagas(){

	}
}
