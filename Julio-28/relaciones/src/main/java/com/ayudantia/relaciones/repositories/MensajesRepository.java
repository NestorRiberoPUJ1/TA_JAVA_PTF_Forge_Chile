package com.ayudantia.relaciones.repositories;

import com.ayudantia.relaciones.models.Mensajes;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajesRepository extends CrudRepository<Mensajes, Long> {
  List<Mensajes> findAll();
  Optional<Mensajes> findById(Long id);
/*   Optional<Mensajes> findByReceptor(Long id);
  Optional<Mensajes> findByRemitente(Long id); */
}
