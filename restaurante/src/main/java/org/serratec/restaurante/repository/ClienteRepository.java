package org.serratec.restaurante.repository;

import java.util.List;

import org.serratec.restaurante.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface de repositório para Cliente
public interface ClienteRepository extends JpaRepository<Clientes, Long> {
	
	List<Clientes> findByNomeContaining(String nome); // Consulta por nome
 
}
