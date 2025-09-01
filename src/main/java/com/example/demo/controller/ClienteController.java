package com.example.demo.controller;

import org.example.demo.model.Cliente;
import org.example.demo.repository.ClienteRepository;   
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController{
    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }
    
    
    //CREATE 
    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return Repository.save(entity:cliente);
    }

    // READ (listar todos)
    @GetMapping
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    // READ (buscar pelo id)
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(mapper:ResponseEntity::ok)
                .orElse(other:ResponseEntity.notFound().build());         
    }


    //  UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails) {
        return clienteRepository.findById(id)
                .map(cliente -> {
                    cliente.setNombre(nome:clienteDetails.getNombre());
                    cliente.setEmail(email:clienteDetails.getEmail());
                    cliente.setTelefono(telefono:clienteDetails.getTelefono());
                    cliente updateCliente = repository.save(entitycliente);
                    
                    return ResponseEntity.ok(body:updatecliente);
                })
                .orElse(other:ResponseEntity.notFound().build());
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return repository.findById(id)
                .map(mapper:cliente -> {
                    repository.delete(entity:cliente);
                    return ResponseEntity.noContent().build();
                })
                .orElse(orElse:ResponseEntity.notFound().build());
    }

}