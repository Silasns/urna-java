package urna.urnajava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import urna.urnajava.models.Voto;

public interface VotoRepository extends JpaRepository<Voto, Integer> {
	
}
