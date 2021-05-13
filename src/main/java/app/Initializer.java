package app;

import app.repository.*;

import java.util.ArrayList;
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
		repartirPlagas();
		repartirEspecies();
		repartirSustancias();
		repartirProductos();
	}
	private ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
	private ArrayList<Especie> listaEspecies = new ArrayList<Especie>();
	private ArrayList<Plaga> listaPlagas = new ArrayList<Plaga>();
	private ArrayList<SustActiva> listaSustancias = new ArrayList<SustActiva>();
	private ArrayList<ProductoFitosanitario> listaProductos = new ArrayList<ProductoFitosanitario>();
	
	public void crearProductos(){
		listaProductos.add(new ProductoFitosanitario("MICROTHIOL SPECIAL DISPERSS", "http://www.prodfitosanitario/pdf/001.pdf"));
		listaProductos.add(new ProductoFitosanitario("COBRE NORDOX 50", "http://www.prodfitosanitario/pdf/002.pdf"));
		listaProductos.add(new ProductoFitosanitario("DECCOSOL-MF", "http://www.prodfitosanitario/pdf/003.pdf"));
		listaProductos.add(new ProductoFitosanitario("BASAGRAN L", "http://www.prodfitosanitario/pdf/004.pdf"));
		listaProductos.add(new ProductoFitosanitario("SP4OK", "http://www.prodfitosanitario/pdf/005.pdf"));
		listaProductos.add(new ProductoFitosanitario("MICROTOX", "http://www.prodfitosanitario/pdf/006.pdf"));
		listaProductos.add(new ProductoFitosanitario("EVER TRANSPARENTE", "http://www.prodfitosanitario/pdf/007.pdf"));
		listaProductos.add(new ProductoFitosanitario("NUFO-Z", "http://www.prodfitosanitario/pdf/008.pdf"));
		listaProductos.add(new ProductoFitosanitario("BANVEL-D", "http://www.prodfitosanitario/pdf/009.pdf"));
		listaProductos.add(new ProductoFitosanitario("QUILAN", "http://www.prodfitosanitario/pdf/010.pdf"));
		listaProductos.add(new ProductoFitosanitario("VENZAR", "http://www.prodfitosanitario/pdf/011.pdf"));
		listaProductos.add(new ProductoFitosanitario("VYDATE 10 G", "http://www.prodfitosanitario/pdf/012.pdf"));
		listaProductos.add(new ProductoFitosanitario("BELTASUR-500", "http://www.prodfitosanitario/pdf/013.pdf"));
		listaProductos.add(new ProductoFitosanitario("CAPTANA", "http://www.prodfitosanitario/pdf/014.pdf"));
		listaProductos.add(new ProductoFitosanitario("CALDO BORDELES MAC 80", "http://www.prodfitosanitario/pdf/015.pdf"));
		listaProductos.add(new ProductoFitosanitario("FULMIT OLEO L.E", "http://www.prodfitosanitario/pdf/016.pdf"));
		listaProductos.add(new ProductoFitosanitario("FULMIT", "http://www.prodfitosanitario/pdf/017.pdf"));
		listaProductos.add(new ProductoFitosanitario("APHOX", "http://www.prodfitosanitario/pdf/018.pdf"));
		listaProductos.add(new ProductoFitosanitario("CAPTAGREX 80", "http://www.prodfitosanitario/pdf/019.pdf"));
		listaProductos.add(new ProductoFitosanitario("DITIVER C PM", "http://www.prodfitosanitario/pdf/020.pdf"));
		listaProductos.add(new ProductoFitosanitario("AZUFRE FAMOLINS", "http://www.prodfitosanitario/pdf/021.pdf"));
		listaProductos.add(new ProductoFitosanitario("VOLCK VERANO", "http://www.prodfitosanitario/pdf/022.pdf"));
		listaProductos.add(new ProductoFitosanitario("NEMACUR 40 LE", "http://www.prodfitosanitario/pdf/023.pdf"));
		listaProductos.add(new ProductoFitosanitario("SANAGRICOLA WP", "http://www.prodfitosanitario/pdf/024.pdf"));
		listaProductos.add(new ProductoFitosanitario("CAPTERAN 50", "http://www.prodfitosanitario/pdf/025.pdf"));
		listaProductos.add(new ProductoFitosanitario("PELT 50 SC", "http://www.prodfitosanitario/pdf/026.pdf"));
		listaProductos.add(new ProductoFitosanitario("ACTELLIC 50-E", "http://www.prodfitosanitario/pdf/027.pdf"));
		listaProductos.add(new ProductoFitosanitario("AGRAL", "http://www.prodfitosanitario/pdf/028.pdf"));
		listaProductos.add(new ProductoFitosanitario("COBRE KEY", "http://www.prodfitosanitario/pdf/029.pdf"));
		listaProductos.add(new ProductoFitosanitario("CUPREBEL", "http://www.prodfitosanitario/pdf/030.pdf"));
		
		for(int i = 0; i<= listaProductos.size()-1; i++) {
			repoProducto.save(listaProductos.get(i));
		}
	}
	
	public void crearSustanciaActivas(){
		
		listaSustancias.add(new SustActiva("Digluconato de clohexidina"));
		listaSustancias.add(new SustActiva("Acido acetilpancetilico"));
		listaSustancias.add(new SustActiva("Cloruro de oxibuprocaina"));
		listaSustancias.add(new SustActiva("Yoduro de tibezonio"));
		listaSustancias.add(new SustActiva("Iodopovidona"));
		listaSustancias.add(new SustActiva("Columneritil"));
		listaSustancias.add(new SustActiva("Clothianidin)"));
		listaSustancias.add(new SustActiva("ethylenedioxy"));
		listaSustancias.add(new SustActiva("dimethanol"));
		listaSustancias.add(new SustActiva("dienyl acetate"));
		listaSustancias.add(new SustActiva("trans phenothrin"));
		listaSustancias.add(new SustActiva("cyanoacetamide"));
		listaSustancias.add(new SustActiva("Butanone peroxide"));
		listaSustancias.add(new SustActiva("Petroleum Distillate"));
		listaSustancias.add(new SustActiva("Sorbitan Oleate"));
		listaSustancias.add(new SustActiva("d-Phenothrin"));
		listaSustancias.add(new SustActiva("Prallethrin"));
		listaSustancias.add(new SustActiva("Imiprothrin"));
		listaSustancias.add(new SustActiva("Cypermethrin"));
		listaSustancias.add(new SustActiva("Picaridin"));
		listaSustancias.add(new SustActiva("Ammonium Benzoate"));
		
		for(int i = 0; i<= listaSustancias.size()-1; i++) {
			repoSustancias.save(listaSustancias.get(i));
		}
	}
	
	public void repartirProductos() {
		
		listaSustancias.get(0).getListaProdFit().add(listaProductos.get(2));
		listaSustancias.get(0).getListaProdFit().add(listaProductos.get(4));
		listaSustancias.get(0).getListaProdFit().add(listaProductos.get(6));
		listaSustancias.get(0).getListaProdFit().add(listaProductos.get(8));
		listaSustancias.get(0).getListaProdFit().add(listaProductos.get(10));
		listaSustancias.get(0).getListaProdFit().add(listaProductos.get(12));
		
		listaSustancias.get(1).getListaProdFit().add(listaProductos.get(1));
		listaSustancias.get(1).getListaProdFit().add(listaProductos.get(3));
		listaSustancias.get(1).getListaProdFit().add(listaProductos.get(5));
		listaSustancias.get(1).getListaProdFit().add(listaProductos.get(7));
		listaSustancias.get(1).getListaProdFit().add(listaProductos.get(9));
		listaSustancias.get(1).getListaProdFit().add(listaProductos.get(11));
		 
		for(int i = 0; i<= listaSustancias.size()-1; i++) {
			repoSustancias.save(listaSustancias.get(i));
		}
	}
	
	public void crearPlagas(){
		listaPlagas.add(new Plaga("Armillaria root rot", "Armillaria luteobubalina", "http://www.plagas/pdf/001.pdf"));
		listaPlagas.add(new Plaga("Bacterial blight", "Pseudomonas syringae", "http://www.plagas/pdf/002.pdf"));
		listaPlagas.add(new Plaga("Sudden wilt", "Pythium", "http://www.plagas/pdf/003.pdf"));
		listaPlagas.add(new Plaga("Stem end rot", "Dothiorella dominicana", "http://www.plagas/pdf/004.pdf"));
		listaPlagas.add(new Plaga("Sclerotium disease", "Sclerotium rolfsii", "http://www.plagas/pdf/005.pdf"));
		listaPlagas.add(new Plaga("Powdery mildew", "Podosphaera aphanis", "http://www.plagas/pdf/006.pdf"));
		listaPlagas.add(new Plaga("Rhizoctonia", "Rhizoctonia solani", "http://www.plagas/pdf/007.pdf"));
		listaPlagas.add(new Plaga("Phytophthora root rot", "Phytophthora cinnamomi", "http://www.plagas/pdf/008.pdf"));
		listaPlagas.add(new Plaga("Lethal yellows", "Phytoplasm australiense", "http://www.plagas/pdf/009.pdf"));
		listaPlagas.add(new Plaga("Gummy stem blight", "Stagonosporopsis cucurbitacearum", "http://www.plagas/pdf/010.pdf"));
		listaPlagas.add(new Plaga("Fusarium rot", "Fusarium", "http://www.plagas/pdf/011.pdf"));
		listaPlagas.add(new Plaga("Downy mildew", "Plasmopara viticola", "http://www.plagas/pdf/012.pdf"));
		listaPlagas.add(new Plaga("Damping off", "Pythium", "http://www.plagas/pdf/013.pdf"));
		listaPlagas.add(new Plaga("Charcoal rot", "Macrophomina phaseolina", "http://www.plagas/pdf/014.pdf"));
		listaPlagas.add(new Plaga("Bacterial spot", "Xanthomonas campestris", "http://www.plagas/pdf/015.pdf"));
		listaPlagas.add(new Plaga("Anthracnose", "Colletotrichum", "http://www.plagas/pdf/016.pdf"));
		
		for(int i = 0; i<= listaPlagas.size()-1; i++) {
			repoPlaga.save(listaPlagas.get(i));
		}
	}
	
	public void repartirSustancias() {
		
		listaPlagas.get(0).getSustanciasActivas().add(listaSustancias.get(0));
		listaPlagas.get(1).getSustanciasActivas().add(listaSustancias.get(0));
		listaPlagas.get(2).getSustanciasActivas().add(listaSustancias.get(0));
		
		listaPlagas.get(4).getSustanciasActivas().add(listaSustancias.get(1));
		listaPlagas.get(5).getSustanciasActivas().add(listaSustancias.get(1));
		listaPlagas.get(6).getSustanciasActivas().add(listaSustancias.get(1));
		
		listaPlagas.get(7).getSustanciasActivas().add(listaSustancias.get(2));
		listaPlagas.get(8).getSustanciasActivas().add(listaSustancias.get(2));
	
		listaPlagas.get(9).getSustanciasActivas().add(listaSustancias.get(3));
		listaPlagas.get(10).getSustanciasActivas().add(listaSustancias.get(3));
		
		listaPlagas.get(11).getSustanciasActivas().add(listaSustancias.get(4));
		listaPlagas.get(12).getSustanciasActivas().add(listaSustancias.get(4));
		
		listaPlagas.get(13).getSustanciasActivas().add(listaSustancias.get(5));
		listaPlagas.get(14).getSustanciasActivas().add(listaSustancias.get(5));
		
		for(int i = 0; i<= listaPlagas.size()-1; i++) {
			repoPlaga.save(listaPlagas.get(i));
		}
	}
	
	public void crearEspecies(){
		//8 especies
		listaEspecies.add(new Especie("Almendras","Prunus dulcis"));
		listaEspecies.add(new Especie("Manzanas","Malus domestica"));
		listaEspecies.add(new Especie("Durazno","Prunus persica"));
		listaEspecies.add(new Especie("Arándano azul","(Vaccinium corymbosum"));
		listaEspecies.add(new Especie("Arándano rojo","Vaccinium erythrocarpum"));
		listaEspecies.add(new Especie("Maíz","Zea mays"));
		listaEspecies.add(new Especie("Trigo","Triticum"));
		listaEspecies.add(new Especie("Sorgo","Sorghum"));
		
		for(int i = 0; i<= listaEspecies.size()-1; i++) {
			repoEspecie.save(listaEspecies.get(i));
		}
		
	}
	public void repartirPlagas() {
		//16 plagas, repartidas entre 8 especies.Almenos una plaga debera afectar a 3 especies diferentes, y 2 plagas a almenos 2 diferentes
		
		listaEspecies.get(0).getListaPlagas().add(listaPlagas.get(0));
		listaEspecies.get(0).getListaPlagas().add(listaPlagas.get(8));
		
		listaEspecies.get(1).getListaPlagas().add(listaPlagas.get(1));
		listaEspecies.get(1).getListaPlagas().add(listaPlagas.get(9));
		
		listaEspecies.get(2).getListaPlagas().add(listaPlagas.get(2));
		listaEspecies.get(2).getListaPlagas().add(listaPlagas.get(10));
		
		listaEspecies.get(3).getListaPlagas().add(listaPlagas.get(3));
		listaEspecies.get(3).getListaPlagas().add(listaPlagas.get(11));
		
		listaEspecies.get(4).getListaPlagas().add(listaPlagas.get(4));
		listaEspecies.get(4).getListaPlagas().add(listaPlagas.get(12));
		
		listaEspecies.get(5).getListaPlagas().add(listaPlagas.get(5));
		listaEspecies.get(5).getListaPlagas().add(listaPlagas.get(13));
		
		listaEspecies.get(6).getListaPlagas().add(listaPlagas.get(6));
		listaEspecies.get(6).getListaPlagas().add(listaPlagas.get(14));
		
		listaEspecies.get(7).getListaPlagas().add(listaPlagas.get(7));
		listaEspecies.get(7).getListaPlagas().add(listaPlagas.get(15));
		
		//Plaga Phytophthora afecta a 3
		listaEspecies.get(7).getListaPlagas().add(listaPlagas.get(6));	//La otra es Trigo
		listaEspecies.get(6).getListaPlagas().add(listaPlagas.get(6));	//La otra es Trigo
		
		//2 Plagas afectan a almenos 2 especies diferentes
		listaEspecies.get(4).getListaPlagas().add(listaPlagas.get(3));	//La otra es arandano azul
		listaEspecies.get(2).getListaPlagas().add(listaPlagas.get(9));	//La otra es Manzanas
		
		for(int i=0; i<=listaEspecies.size()-1; i++) {
			repoEspecie.save(listaEspecies.get(i));
		}

	}
	
	public void crearCategoria() {
		//4 categorias
		listaCategorias.add(new Categoria("Magnoliopsida"));
		listaCategorias.add(new Categoria("Ericales"));
		listaCategorias.add(new Categoria("Graminea"));
		listaCategorias.add(new Categoria("Rosidae"));
		
		for(int i=0; i<=listaCategorias.size()-1; i++) {
			repoCategoria.save(listaCategorias.get(i));
		}
	}
	
	public void repartirEspecies() {
		//Especies repartidas entre 4 categorias, almenos una de ellas debera pertenecer a dos o mas categorias
		List<Especie> listaEspecies = repoEspecie.findAll();
		
		listaCategorias.get(3).getListaEspecies().add(listaEspecies.get(0));
		
		listaCategorias.get(0).getListaEspecies().add(listaEspecies.get(1));
		listaCategorias.get(0).getListaEspecies().add(listaEspecies.get(2));
		
		listaCategorias.get(1).getListaEspecies().add(listaEspecies.get(3));
		listaCategorias.get(1).getListaEspecies().add(listaEspecies.get(4));
		
		listaCategorias.get(2).getListaEspecies().add(listaEspecies.get(5));
		listaCategorias.get(2).getListaEspecies().add(listaEspecies.get(6));
		listaCategorias.get(2).getListaEspecies().add(listaEspecies.get(7));
			
		for(int i=0; i<=listaCategorias.size()-1; i++) {
			repoCategoria.save(listaCategorias.get(i));
		}
	}

	
}
