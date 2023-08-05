package com.ayudantia.api.controllers;

import com.ayudantia.api.models.User;
import com.ayudantia.api.services.ApiService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

  private final ApiService apiService;

  public UserController(ApiService apiService) {
    this.apiService = apiService;
  }

  ///students/create?firstName=John&lastName=Doe&age=35

  @PostMapping("create")
  public String createUser(
    @PathParam("username") String username
  ) {

    User nuevo= new User(username);

    apiService.crearUsuario(nuevo);

    return "Creado";
  }
}
