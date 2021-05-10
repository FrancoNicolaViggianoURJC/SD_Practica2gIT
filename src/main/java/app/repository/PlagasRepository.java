package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Plaga;

public interface PlagasRepository extends JpaRepository<Plaga, Long>{
	
}
