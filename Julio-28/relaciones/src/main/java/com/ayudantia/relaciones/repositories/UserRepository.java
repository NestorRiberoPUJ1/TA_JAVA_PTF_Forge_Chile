package com.ayudantia.relaciones.repositories;

import com.ayudantia.relaciones.models.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  List<User> findAll();
  Optional<User> findById(Long id);
  Optional<User> findByUsername(String username);
}
