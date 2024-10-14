package org.serratec.restaurante.repository;

import java.util.List;

import org.serratec.restaurante.model.Pratos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PratoRepository extends JpaRepository<Pratos, Long> {
	List<Pratos> findByNomeContaining(String nome); // Consulta por nome
}
