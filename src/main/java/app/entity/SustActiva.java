package app.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
@Entity
public class SustActiva {

	private String nombre;
	
	@ManyToMany
	private Collection<Plaga> plagas;
	
	@ManyToMany(mappedBy="sustancias")
	private List<ProductoFitosanitario> listaProdFit;

	public SustActiva(String nombre) {
		this.nombre = nombre;
		this.listaProdFit = new ArrayList<ProductoFitosanitario>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Plaga> getPlagas() {
		return plagas;
	}

	public void setPlagas(Collection<Plaga> plagas) {
		this.plagas = plagas;
	}

	public List<ProductoFitosanitario> getListaProdFit() {
		return listaProdFit;
	}

	public void setListaProdFit(List<ProductoFitosanitario> listaProdFit) {
		this.listaProdFit = listaProdFit;
	}
	
}
