package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    //CREATE
    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return repository.save(cliente);
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
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //  UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails) {
        return repository.findById(id)
                .map(cliente -> {
                    cliente.setNome(clienteDetails.getNome());
                    cliente.setEmail(clienteDetails.getEmail());
                    cliente.setTelefone(clienteDetails.getTelefone());
                    Cliente updatedCliente = repository.save(cliente);
                    return ResponseEntity.ok(updatedCliente);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return repository.findById(id)
                .map(cliente -> {
                    repository.delete(cliente);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
