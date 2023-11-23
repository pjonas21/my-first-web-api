package com.pjonas.webapi.repository;

import com.pjonas.webapi.handler.BusinessException;
import com.pjonas.webapi.handler.CampoObrigatorioException;
import com.pjonas.webapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if(usuario.getLogin() == null) {
            throw new CampoObrigatorioException("login");
        }
        if(usuario.getId() == null){
            System.out.println("Salvando usuario..." + usuario);
        } else {
            System.out.println("Atualizando usuario..." + usuario);
        }
    }

    public void deleteById(Integer id) {
        System.out.println("Deletando usuario com id " + id);
    }

    public List<Usuario> findAll() {
        System.out.println("LISTA USUARIOS - Lintando usuarios do sistema");
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("pjonas", "123"));
        listaUsuarios.add(new Usuario("lg", "123"));
        return listaUsuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println("Buscando usuario com id " + id);
        return new Usuario("pjonas", "123");
    }

    public Usuario findByLogin(String login) {
        System.out.println("Buscando usuario com login " + login);
        return new Usuario("pjonas", "123");
    }

}
