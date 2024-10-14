package org.serratec.restaurante.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "pedidos")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
    private Long id;

    @ManyToOne // Relacionamento muitos-para-um com Cliente
    private Clientes cliente;

    @ManyToOne // Relacionamento muitos-para-um com Prato
    private Pratos prato;

    @Positive(message = "A quantidade deve ser um valor positivo.") // Validação para quantidade
    private int quantidade;

    private Date data; // Data do pedido formato ja no do sql

 // Getters e Setters
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Pratos getPrato() {
		return prato;
	}

	public void setPrato(Pratos prato) {
		this.prato = prato;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
    
    
}
