package com.ayudantia.relaciones.services;

import com.ayudantia.relaciones.models.Mensajes;
import com.ayudantia.relaciones.repositories.MensajesRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MensajesServices {

  private final MensajesRepository mensajesRepository;

  public MensajesServices(MensajesRepository mensajesRepository) {
    this.mensajesRepository = mensajesRepository;
  }

  public Mensajes createMensaje(Mensajes b) {
    return mensajesRepository.save(b);
  }

  public ArrayList<Mensajes> buscarTodos() {
    return (ArrayList<Mensajes>) mensajesRepository.findAll();
  }

  public Mensajes buscarId(Long id) {
    Optional<Mensajes> optionalMensaje = mensajesRepository.findById(id);
    if (optionalMensaje.isPresent()) {
      return optionalMensaje.get();
    } else {
      return null;
    }
  }

}
