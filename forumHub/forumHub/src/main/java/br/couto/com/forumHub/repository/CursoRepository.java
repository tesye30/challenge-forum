package br.couto.com.forumHub.repository;

import br.couto.com.forumHub.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
