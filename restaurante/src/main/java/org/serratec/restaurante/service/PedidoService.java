package org.serratec.restaurante.service;

import java.util.List;

import org.serratec.restaurante.model.Pedidos;
import org.serratec.restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

//Classe de serviço para Pedido
@Service
public class PedidoService {
 @Autowired
 private PedidoRepository pedidoRepository;

 public Pedidos fazerPedido(@Valid Pedidos pedido) {
     return pedidoRepository.save(pedido);
 }

 public List<Pedidos> listarPedidos() {
     return pedidoRepository.findAll();
 }

 public Pedidos atualizarPedido(Long id, @Valid Pedidos pedido) {
     pedido.setId(id);
     return pedidoRepository.save(pedido);
 }

 public void removerPedido(Long id) {
     pedidoRepository.deleteById(id);
 }
}