package com.ayudantia.api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ayudantia.api.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
  List<User> findAll();
  List<User> findByEmail(String search);
}
