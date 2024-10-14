package org.serratec.restaurante.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

	//Classe representando um Prato
@Entity
public class Pratos {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
	 private Long id;
	
	 @NotBlank(message = "O nome do prato não pode ser vazio.") // Validação para nome
	 private String nome;
	
	 private String descricao; // Descrição do prato
	
	 @Positive(message = "O preço deve ser um valor positivo.") // Validação para preço
	 private double preco;
	 
	// Getters e Setters
	 
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
 
 
}