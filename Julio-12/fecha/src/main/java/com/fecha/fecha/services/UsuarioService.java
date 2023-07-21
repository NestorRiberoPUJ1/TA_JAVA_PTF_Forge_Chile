package com.fecha.fecha.services;

import com.fecha.fecha.models.Usuario;
import com.fecha.fecha.repositories.UserRepository;
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
}
