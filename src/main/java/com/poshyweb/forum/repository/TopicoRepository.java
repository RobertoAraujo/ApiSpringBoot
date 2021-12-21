package com.poshyweb.forum.repository;

import com.poshyweb.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico , Long> {

    List<Topico> findByCursoNome(String nomeCurso);
}
