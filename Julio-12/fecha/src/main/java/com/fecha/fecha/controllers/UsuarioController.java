package com.fecha.fecha.controllers;

import com.fecha.fecha.models.Usuario;
import com.fecha.fecha.services.UsuarioService;
import jakarta.servlet.http.HttpSession;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UsuarioController {

  private final UsuarioService usuarioService;
  

  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
}


@GetMapping("/usuario/{id}")
  public String showUser(
    Model model,
    HttpSession session,
    @PathVariable("id") Long id
  ) {

    Optional<Usuario> user= usuarioService.buscarId(id);

    System.out.println(user.get().getEmail());

    return "user.jsp";
  }
}
