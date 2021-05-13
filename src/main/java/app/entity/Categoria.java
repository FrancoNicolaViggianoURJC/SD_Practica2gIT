package app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long id;
	
	
	private String nombre;
	
	@ManyToMany	//(mappedBy="categorias")
	@JoinTable(name="categorias_especies", joinColumns=@JoinColumn(name="especie_id"), inverseJoinColumns=@JoinColumn(name="categoria_id"))
	private List<Especie> listaEspecies;

	public Categoria() {}
	
	public Categoria(String nombre) {
		this.nombre = nombre;
		this.listaEspecies = new ArrayList<Especie>();
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
	
}
