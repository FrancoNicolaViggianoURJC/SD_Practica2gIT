package app.entity;

import java.util.ArrayList;
import java.util.Collection;
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
@Entity
public class Plaga {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long plaga_id;
	
	private String nombreVulgar;
	private String nombreCientifico;
	private String url;
	
	@ManyToMany
	private List<Especie> especies;
	
	@ManyToMany(cascade=CascadeType.ALL)	//(fetch=FetchType.EAGER)	//(mappedBy="plagas")
	@JoinTable(name="plagas_sustancias", joinColumns=@JoinColumn(name="sustancia_id"), inverseJoinColumns=@JoinColumn(name="plaga_id"))
	private List<SustActiva> sustanciasActivas;

	public Plaga() {}
	
	public Plaga(String nombreVulgar, String nombreCientifico, String url) {
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.url = url;
		this.sustanciasActivas = new ArrayList<SustActiva>();
	}
	
	public Long getId() {
		return plaga_id;
	}

	public void setId(Long id) {
		this.plaga_id = id;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	public Collection<Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
	}
	
	public List<SustActiva> getSustanciasActivas() {
		return sustanciasActivas;
	}

	public void setSustanciasActivas(List<SustActiva> sustanciasActivas) {
		this.sustanciasActivas = sustanciasActivas;
	}
	
	
}
