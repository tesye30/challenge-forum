package br.couto.com.forumHub.repository;

import br.couto.com.forumHub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findTop10ByOrderByDataCriacaoAsc();
    List<Topico> findByCursoNomeAndDataCriacaoYear(String nomeCurso, int ano);
}
