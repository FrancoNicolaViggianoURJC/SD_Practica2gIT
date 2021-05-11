package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.ProductoFitosanitario;

public interface ProductoFitosanitarioRepository extends JpaRepository<ProductoFitosanitario, Long>{

	public List<ProductoFitosanitario> findByNombre(String nombre);
}
