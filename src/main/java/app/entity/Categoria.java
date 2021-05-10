package app.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	
	private String nombre;
	
	@ManyToMany(mappedBy="categorias")
	private List<Especie> listaEspecies;
	

	private Collection<Especie> especies;

	public Categoria(String nombre, List<Especie> listaEspecies, Collection<Especie> especies) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Especie> getListaEspecies() {
		return listaEspecies;
	}

	public void setListaEspecies(List<Especie> listaEspecies) {
		this.listaEspecies = listaEspecies;
	}

	public Collection<Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(Collection<Especie> especies) {
		this.especies = especies;
	}
	
	
	
	
}
