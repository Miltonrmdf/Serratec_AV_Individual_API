package org.serratec.restaurante.controller;

import java.util.List;

import org.serratec.restaurante.model.Pratos;
import org.serratec.restaurante.service.PratoService;
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

//Controlador para gerenciar pratos
@RestController // Indica que esta classe é um controlador REST, capaz de lidar com requisições HTTP
@RequestMapping("/restaurante/pratos") // Define a URL base para todos os endpoints deste controlador
public class PratoController {
	 @Autowired // Injeção de dependência do serviço de pratos
	 private PratoService pratoService; // Instância do serviço que contém a lógica de negócios para pratos
	
	 // Endpoint para adicionar um novo prato
	 @PostMapping // Mapeia requisições HTTP POST para este método
	 public ResponseEntity<Pratos> adicionarPrato(@Valid @RequestBody Pratos prato) {
	     // Chama o método do serviço para adicionar o prato e retorna a resposta HTTP com o prato adicionado
	     return ResponseEntity.ok(pratoService.adicionarPrato(prato));
	 }
	
	 // Endpoint para listar todos os pratos
	 @GetMapping // Mapeia requisições HTTP GET para este método
	 public ResponseEntity<List<Pratos>> listarPratos() {
	     // Chama o método do serviço para obter a lista de pratos e retorna essa lista como resposta
	     return ResponseEntity.ok(pratoService.listarPratos());
	 }
	
	 // Endpoint para atualizar um prato existente
	 @PutMapping("/{id}") // Mapeia requisições HTTP PUT com um ID de prato na URL
	 public ResponseEntity<Pratos> atualizarPrato(@PathVariable Long id, @Valid @RequestBody Pratos prato) {
	     // Chama o método do serviço para atualizar o prato especificado pelo ID e retorna a resposta
	     return ResponseEntity.ok(pratoService.atualizarPrato(id, prato));
	 }
	
	 // Endpoint para remover um prato
	 @DeleteMapping("/{id}") // Mapeia requisições HTTP DELETE com um ID de prato na URL
	 public ResponseEntity<Void> removerPrato(@PathVariable Long id) {
	     // Chama o método do serviço para remover o prato especificado pelo ID
	     pratoService.removerPrato(id);
	     // Retorna uma resposta HTTP 204 No Content indicando que a operação foi bem-sucedida
	     return ResponseEntity.noContent().build();
	 }
}