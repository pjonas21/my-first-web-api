package com.pjonas.webapi.controller;

import com.pjonas.webapi.model.Usuario;
import com.pjonas.webapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{login}")
    public Usuario getOne(@PathVariable("login") String login) {
        return repository.findByLogin(login);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @PutMapping
    public void updateUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }




}
