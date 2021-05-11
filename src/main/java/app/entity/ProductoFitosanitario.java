package app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class ProductoFitosanitario {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long sustancia_id;
	
	private String nombre;
	private String url;
	
	@ManyToMany
	private List<SustActiva> sustancias;
	
	public ProductoFitosanitario() {}
	
	public ProductoFitosanitario(String nombre, String url) {
		this.nombre = nombre;
		this.url = url;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<SustActiva> getSustancias() {
		return sustancias;
	}

	public void setSustancias(List<SustActiva> sustancias) {
		this.sustancias = sustancias;
	}



}
