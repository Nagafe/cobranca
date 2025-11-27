package edu.ifmt.cobranca.ifmt.repository;

import edu.ifmt.cobranca.ifmt.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Titulos extends JpaRepository<Titulo, Long> {
	
}