package org.serratec.restaurante.repository;

import java.util.List;

import org.serratec.restaurante.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface de repositório para Pedido
public interface PedidoRepository extends JpaRepository<Pedidos, Long> {
 
	List<Pedidos> findByClienteId(Long clienteId); // Consulta por ID do cliente

}