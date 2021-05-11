package app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class SustActiva {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long sustancia_id;
	
	private String nombre;
	
	@ManyToMany
	private List<Plaga> plagas;
	
	@ManyToMany(fetch=FetchType.EAGER)//(mappedBy="sustancias")
	@JoinTable(name="sustancias_productos", joinColumns=@JoinColumn(name="producto_id"), inverseJoinColumns=@JoinColumn(name="sustancia_id"))
	private List<ProductoFitosanitario> listaProdFit;

	public SustActiva() {}
	
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

	
	public List<Plaga> getPlagas() {
		return plagas;
	}

	public void setPlagas(List<Plaga> plagas) {
		this.plagas = plagas;
	}
	
	public List<ProductoFitosanitario> getListaProdFit() {
		return listaProdFit;
	}

	public void setListaProdFit(List<ProductoFitosanitario> listaProdFit) {
		this.listaProdFit = listaProdFit;
	}
	
}
