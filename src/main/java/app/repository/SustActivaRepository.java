package app.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.SustActiva;

public interface SustActivaRepository extends JpaRepository<SustActiva, Long> {

	public SustActiva findByNombre(String nombre);
}
