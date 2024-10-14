package org.serratec.restaurante.controller;

import java.util.List;

import org.serratec.restaurante.model.Clientes;
import org.serratec.restaurante.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

//Controlador para gerenciar clientes
@RestController
@RequestMapping("/restaurante/clientes") // Define o caminho base para os endpoints deste controlador
public class ClienteController {
	 @Autowired // Injeção de dependência do serviço de cliente
	 private ClienteService clienteService;
	
	 // Endpoint para adicionar um novo cliente
	 @PostMapping // Mapeia requisições POST para este método
	 public ResponseEntity<Clientes> adicionarCliente(@Valid @RequestBody Clientes cliente) {
	     // Chama o método de serviço para adicionar o cliente e retorna a resposta
	     return ResponseEntity.ok(clienteService.adicionarCliente(cliente));
	 }
	
	 // Endpoint para listar todos os clientes
	 @GetMapping // Mapeia requisições GET para este método
	 public ResponseEntity<List<Clientes>> listarClientes() {
	     // Chama o método de serviço para listar os clientes e retorna a lista
	     return ResponseEntity.ok(clienteService.listarClientes());
	 }
	
	 // Endpoint para atualizar um cliente existente
	 @PutMapping("/{id}") // Mapeia requisições PUT para este método com o ID do cliente na URL
	 public ResponseEntity<Clientes> atualizarCliente(@PathVariable Long id, @Valid @RequestBody Clientes cliente) {
	     // Chama o método de serviço para atualizar o cliente e retorna a resposta
	     return ResponseEntity.ok(clienteService.atualizarCliente(id, cliente));
	 }
	
	 // Endpoint para remover um cliente
	 @DeleteMapping("/{id}") // Mapeia requisições DELETE para este método com o ID do cliente na URL
	 public ResponseEntity<Void> removerCliente(@PathVariable Long id) {
	     // Chama o método de serviço para remover o cliente
	     clienteService.removerCliente(id);
	     // Retorna uma resposta HTTP sem conteúdo (204 No Content)
	     return ResponseEntity.noContent().build();
	 }
}