package com.fecha.fecha.repositories;

import com.fecha.fecha.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Usuario, Long> {
  List<Usuario> findAll();
  List<Usuario> findByEmail(String search);
}
