package org.serratec.restaurante.service;

import java.util.List;

import org.serratec.restaurante.model.Pratos;
import org.serratec.restaurante.repository.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

//Classe de serviço para Prato
@Service
public class PratoService {
 @Autowired
 private PratoRepository pratoRepository;

 public Pratos adicionarPrato(@Valid Pratos prato) {
     return pratoRepository.save(prato);
 }

 public List<Pratos> listarPratos() {
     return pratoRepository.findAll();
 }

 public Pratos atualizarPrato(Long id, @Valid Pratos prato) {
     prato.setId(id);
     return pratoRepository.save(prato);
 }

 public void removerPrato(Long id) {
     pratoRepository.deleteById(id);
 }
}
