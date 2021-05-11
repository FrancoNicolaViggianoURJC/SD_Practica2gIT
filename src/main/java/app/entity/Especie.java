package app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.transaction.Transactional;


@Entity
public class Especie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long especie_id;
	
	private String nombreVulgar;
	private String nombreCientifico;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)	//(mappedBy="especies")
	@JoinTable(name="especies_plagas", joinColumns=@JoinColumn(name="plaga_id"), inverseJoinColumns=@JoinColumn(name="especie_id"))
	private List<Plaga> listaPlagas;
	
	@ManyToMany 
	private List<Categoria> categorias;
	
	public Especie() {}
	
	public Especie(String nombreVulgar, String nombreCientifico) {
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.listaPlagas = new ArrayList<Plaga>();
	}

	public Long getId() {
		return especie_id;
	}

	public void setId(Long id) {
		this.especie_id = id;
	}

	public String getNombreVulgar() {
		return nombreVulgar;
	}

	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public List<Plaga> getListaPlagas() {
		return listaPlagas;
	}

	public void setListaPlagas(List<Plaga> listaPlagas) {
		this.listaPlagas = listaPlagas;
	}


	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
}
