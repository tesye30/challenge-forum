package br.couto.com.forumHub.repository;

import br.couto.com.forumHub.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
