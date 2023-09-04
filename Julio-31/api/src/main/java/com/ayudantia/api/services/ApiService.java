package com.ayudantia.api.services;

import com.ayudantia.api.models.User;
import com.ayudantia.api.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

  private final UserRepository userRepository;

  public ApiService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User crearUsuario(User u) {
    return userRepository.save(u);
  }
  /* 
    public Info crearInformacion(Info u) {
    return infoRepository.save(u);
  }
  */
}
