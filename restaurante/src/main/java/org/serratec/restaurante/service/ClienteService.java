package org.serratec.restaurante.service;

import java.util.List;

import org.serratec.restaurante.model.Clientes;
import org.serratec.restaurante.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

//Classe de serviço para Cliente
@Service
public class ClienteService {
 @Autowired
 private ClienteRepository clienteRepository;

 public Clientes adicionarCliente(@Valid Clientes cliente) {
     return clienteRepository.save(cliente);
 }

 public List<Clientes> listarClientes() {
     return clienteRepository.findAll();
 }

 public Clientes atualizarCliente(Long id, @Valid Clientes cliente) {
     cliente.setId(id);
     return clienteRepository.save(cliente);
 }

 public void removerCliente(Long id) {
     clienteRepository.deleteById(id);
 }
}
