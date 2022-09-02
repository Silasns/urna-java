package urna.urnajava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import urna.urnajava.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	
}
