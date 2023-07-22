package com.fecha.fecha.services;

import com.fecha.fecha.models.Usuario;
import com.fecha.fecha.repositories.UserRepository;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

  private final UserRepository userRepository;

  public UsuarioService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  //Creando un usuario.
  public Usuario createUsuario(Usuario b) {
    return userRepository.save(b);
  }

  public ArrayList<Usuario> buscarTodos() {
    return (ArrayList<Usuario>) userRepository.findAll();
  }

  public Optional<Usuario> buscarId(Long id) {
    return userRepository.findById(id);
  }
}
