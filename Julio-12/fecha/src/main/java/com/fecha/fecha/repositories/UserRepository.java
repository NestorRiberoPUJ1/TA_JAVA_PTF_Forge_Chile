package com.fecha.fecha.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fecha.fecha.models.Usuario;

@Repository
public interface UserRepository extends CrudRepository<Usuario, Long> {
  List<Usuario> findAll();
  List<Usuario> findByEmail(String search);
}
