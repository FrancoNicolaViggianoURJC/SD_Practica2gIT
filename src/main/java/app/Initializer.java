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
	
	@PostConstruct public void crear(){
		crearProductos();
		crearSustanciaActivas();
		crearPlagas();
		crearEspecies();
		crearCategoria();
	}
	
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
	
	public void crearPlagas(){
		repoPlaga.save(new Plaga("Armillaria root rot", "Armillaria luteobubalina", "http://www.plagas/pdf/001.pdf"));
		repoPlaga.save(new Plaga("Bacterial blight", "Pseudomonas syringae", "http://www.plagas/pdf/002.pdf"));
		repoPlaga.save(new Plaga("Sudden wilt", "Pythium", "http://www.plagas/pdf/003.pdf"));
		repoPlaga.save(new Plaga("Stem end rot", "Dothiorella dominicana", "http://www.plagas/pdf/004.pdf"));
		repoPlaga.save(new Plaga("Sclerotium disease", "Sclerotium rolfsii", "http://www.plagas/pdf/005.pdf"));
		repoPlaga.save(new Plaga("Powdery mildew", "Podosphaera aphanis", "http://www.plagas/pdf/006.pdf"));
		repoPlaga.save(new Plaga("Rhizoctonia", "Rhizoctonia solani", "http://www.plagas/pdf/007.pdf"));
		repoPlaga.save(new Plaga("Phytophthora root rot", "Phytophthora cinnamomi", "http://www.plagas/pdf/008.pdf"));
		repoPlaga.save(new Plaga("Lethal yellows", "Phytoplasm australiense", "http://www.plagas/pdf/009.pdf"));
		repoPlaga.save(new Plaga("Gummy stem blight", "Stagonosporopsis cucurbitacearum", "http://www.plagas/pdf/010.pdf"));
		repoPlaga.save(new Plaga("Fusarium rot", "Fusarium", "http://www.plagas/pdf/011.pdf"));
		repoPlaga.save(new Plaga("Downy mildew", "Plasmopara viticola", "http://www.plagas/pdf/012.pdf"));
		repoPlaga.save(new Plaga("Damping off", "Pythium", "http://www.plagas/pdf/013.pdf"));
		repoPlaga.save(new Plaga("Charcoal rot", "Macrophomina phaseolina", "http://www.plagas/pdf/014.pdf"));
		repoPlaga.save(new Plaga("Bacterial spot", "Xanthomonas campestris", "http://www.plagas/pdf/015.pdf"));
		repoPlaga.save(new Plaga("Anthracnose", "Colletotrichum", "http://www.plagas/pdf/016.pdf"));
	}
	
	public void crearEspecies(){
		//8 especies
		
		repoEspecie.save(new Especie("Almendras","Prunus dulcis"));		//Rosidae
		repoEspecie.save(new Especie("Manzanas","Malus domestica"));	//Magnoliopsida
		repoEspecie.save(new Especie("Durazno","Prunus persica"));		//Magnoliopsida
		repoEspecie.save(new Especie("Arándano azul","(Vaccinium corymbosum"));		//Ericales
		repoEspecie.save(new Especie("Arándano rojo","Vaccinium erythrocarpum"));	//Ericales
		repoEspecie.save(new Especie("Maíz","Zea mays"));	//graminea
		repoEspecie.save(new Especie("Trigo","Triticum"));	//graminea
		repoEspecie.save(new Especie("Sorgo","Sorghum"));	//graminea
		
	}
	/* Crear una funcion a la que llamaremos despues de crear todo
		//16 plagas, repartidas entre 8 especies.Almenos una plaga debera afectar a 3 especies diferentes, y 2 plagas a almenos 2 diferentes
		List<Plaga> listaPlagas = repoPlaga.findAll();
		
		repoEspecie.findByNombreVulgar("Almendras").getListaPlagas().add(listaPlagas.get(0));
		repoEspecie.findByNombreVulgar("Almendras").getListaPlagas().add(listaPlagas.get(8));
		
		repoEspecie.findByNombreVulgar("Manzanas").getListaPlagas().add(listaPlagas.get(1));
		repoEspecie.findByNombreVulgar("Manzanas").getListaPlagas().add(listaPlagas.get(9));
		
		repoEspecie.findByNombreVulgar("Durazno").getListaPlagas().add(listaPlagas.get(2));
		repoEspecie.findByNombreVulgar("Durazno").getListaPlagas().add(listaPlagas.get(10));
		
		repoEspecie.findByNombreVulgar("Arándano azul").getListaPlagas().add(listaPlagas.get(3));
		repoEspecie.findByNombreVulgar("Arándano azul").getListaPlagas().add(listaPlagas.get(11));
		
		repoEspecie.findByNombreVulgar("Arándanzo rojo").getListaPlagas().add(listaPlagas.get(4));
		repoEspecie.findByNombreVulgar("Arándanzo rojo").getListaPlagas().add(listaPlagas.get(12));
		
		repoEspecie.findByNombreVulgar("Maíz").getListaPlagas().add(listaPlagas.get(5));
		repoEspecie.findByNombreVulgar("Maíz").getListaPlagas().add(listaPlagas.get(13));
		
		repoEspecie.findByNombreVulgar("Trigo").getListaPlagas().add(listaPlagas.get(6));
		repoEspecie.findByNombreVulgar("Trigo").getListaPlagas().add(listaPlagas.get(14));
		
		repoEspecie.findByNombreVulgar("Sorgo").getListaPlagas().add(listaPlagas.get(7));
		repoEspecie.findByNombreVulgar("Sorgo").getListaPlagas().add(listaPlagas.get(15));
		
		//Plaga Phytophthora afecta a 3
		repoEspecie.findByNombreVulgar("Sorgo").getListaPlagas().add(listaPlagas.get(6));	//La otra es Trigo
		repoEspecie.findByNombreVulgar("Maíz").getListaPlagas().add(listaPlagas.get(6));	//La otra es Trigo
		
		//2 Plagas afectan a almenos 2 especies diferentes
		repoEspecie.findByNombreVulgar("Arándanzo rojo").getListaPlagas().add(listaPlagas.get(3));	//La otra es arandano azul
		repoEspecie.findByNombreVulgar("Durazno").getListaPlagas().add(listaPlagas.get(9));	//La otra es Manzanas
		
		repoEspecie.save(repoEspecie.findByNombreVulgar("Almendras"));
		repoEspecie.save(repoEspecie.findByNombreVulgar("Manzanas"));
		repoEspecie.save(repoEspecie.findByNombreVulgar("Durazno"));
		repoEspecie.save(repoEspecie.findByNombreVulgar("Arándano azul"));
		repoEspecie.save(repoEspecie.findByNombreVulgar("Arándanzo rojo"));
		repoEspecie.save(repoEspecie.findByNombreVulgar("Maíz"));
		repoEspecie.save(repoEspecie.findByNombreVulgar("Trigo"));
		repoEspecie.save(repoEspecie.findByNombreVulgar("Sorgo"));
	}
	*/
	public void crearCategoria() {
		//4 categorias
		repoCategoria.save(new Categoria("Magnoliopsida"));
		repoCategoria.save(new Categoria("Ericales"));
		repoCategoria.save(new Categoria("Graminea"));
		repoCategoria.save(new Categoria("Rosidae"));
		
	}
	/* Idem que la funcion anterior
		//Especies repartidas entre 4 categorias, almenos una de ellas debera pertenecer a dos o mas categorias
		List<Especie> listaEspecies = repoEspecie.findAll();
		
		repoCategoria.findByNombre("Rosidae").getListaEspecies().add(listaEspecies.get(0));
		
		repoCategoria.findByNombre("Magnoliopsida").getListaEspecies().add(listaEspecies.get(1));
		repoCategoria.findByNombre("Magnoliopsida").getListaEspecies().add(listaEspecies.get(2));
		
		repoCategoria.findByNombre("Ericales").getListaEspecies().add(listaEspecies.get(3));
		repoCategoria.findByNombre("Ericales").getListaEspecies().add(listaEspecies.get(4));
		
		repoCategoria.findByNombre("Graminea").getListaEspecies().add(listaEspecies.get(5));
		repoCategoria.findByNombre("Graminea").getListaEspecies().add(listaEspecies.get(6));
		repoCategoria.findByNombre("Graminea").getListaEspecies().add(listaEspecies.get(7));
		
		
	}
	*/
	
}
