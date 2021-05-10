package app.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Plaga {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	private String nombreVulgar;
	private String nombreCientifico;
	private String url;
	
	@ManyToMany
	private Collection<Especie> especies;
	
	@ManyToMany(mappedBy="plagas")
	private List<SustActiva> sustanciasActivas;

	
	public Plaga(Long id, String nombreVulgar, String nombreCientifico, String url, Collection<Especie> especies,
			List<SustActiva> sustanciasActivas) {
		this.id = id;
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.url = url;
		this.especies = especies;
		this.sustanciasActivas = sustanciasActivas;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setEspecies(Collection<Especie> especies) {
		this.especies = especies;
	}

	public List<SustActiva> getSustanciasActivas() {
		return sustanciasActivas;
	}

	public void setSustanciasActivas(List<SustActiva> sustanciasActivas) {
		this.sustanciasActivas = sustanciasActivas;
	}
	
	
}
