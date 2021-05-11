package app.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.SustActiva;

public interface SustActivaRepository extends JpaRepository<SustActiva, Long> {

	public SustActiva findByNombre(String nombre);
}
