package org.serratec.restaurante.controller;

import java.util.List;

import org.serratec.restaurante.model.Pedidos;
import org.serratec.restaurante.service.PedidoService;
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

//Controlador para gerenciar pedidos
@RestController // Indica que esta classe é um controlador REST, lidando com requisições HTTP
@RequestMapping("/restaurante/pedidos") // Define a URL base para os endpoints deste controlador
public class PedidoController {
 @Autowired // Injeção de dependência do serviço de pedidos
 private PedidoService pedidoService; // Instância do serviço que contém a lógica de negócios para pedidos

 // Endpoint para fazer um novo pedido
 @PostMapping // Mapeia requisições HTTP POST para este método
 public ResponseEntity<Pedidos> fazerPedido(@Valid @RequestBody Pedidos pedido) {
     // Chama o método do serviço para criar o pedido e retorna a resposta HTTP com o pedido criado
     return ResponseEntity.ok(pedidoService.fazerPedido(pedido));
 }

 // Endpoint para listar todos os pedidos
 @GetMapping // Mapeia requisições HTTP GET para este método
 public ResponseEntity<List<Pedidos>> listarPedidos() {
     // Chama o método do serviço para obter a lista de pedidos e retorna essa lista como resposta
     return ResponseEntity.ok(pedidoService.listarPedidos());
 }

 // Endpoint para atualizar um pedido existente
 @PutMapping("/{id}") // Mapeia requisições HTTP PUT com um ID de pedido na URL
 public ResponseEntity<Pedidos> atualizarPedido(@PathVariable Long id, @Valid @RequestBody Pedidos pedido) {
     // Chama o método do serviço para atualizar o pedido especificado pelo ID e retorna a resposta
     return ResponseEntity.ok(pedidoService.atualizarPedido(id, pedido));
 }

 // Endpoint para remover um pedido
 @DeleteMapping("/{id}") // Mapeia requisições HTTP DELETE com um ID de pedido na URL
 public ResponseEntity<Void> removerPedido(@PathVariable Long id) {
     // Chama o método do serviço para remover o pedido especificado pelo ID
     pedidoService.removerPedido(id);
     // Retorna uma resposta HTTP 204 No Content indicando que a operação foi bem-sucedida
     return ResponseEntity.noContent().build();
 }
}