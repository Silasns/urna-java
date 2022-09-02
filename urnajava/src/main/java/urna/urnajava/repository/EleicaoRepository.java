package urna.urnajava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import urna.urnajava.models.Eleicao;

public interface EleicaoRepository extends JpaRepository<Eleicao, Integer>{

}