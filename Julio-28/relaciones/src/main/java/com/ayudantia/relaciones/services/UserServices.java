package com.ayudantia.relaciones.services;

import com.ayudantia.relaciones.models.Mensajes;
import com.ayudantia.relaciones.models.User;
import com.ayudantia.relaciones.repositories.UserRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

  private final UserRepository userRepository;

  public UserServices(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(User b) {
    return userRepository.save(b);
  }

  public ArrayList<User> buscarTodos() {
    return (ArrayList<User>) userRepository.findAll();
  }

  public User buscarId(Long id) {
    Optional<User> optionalUser = userRepository.findById(id);
    if (optionalUser.isPresent()) {
      return optionalUser.get();
    } else {
      return null;
    }
  }
}
