package com.fecha.fecha.controllers;

import com.fecha.fecha.models.Usuario;
import com.fecha.fecha.services.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegisterController {

  private final UsuarioService usuarioService;

  public RegisterController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  @GetMapping("/formulario")
  public String registro(
    Model model,
    HttpSession session,
    RedirectAttributes redirectAttributes
  ) {
    /* */
    System.out.println(redirectAttributes.getFlashAttributes());
    return "formulario.jsp";
  }

  @PostMapping("/formulario")
  public String registroData(
    HttpSession session,
    RedirectAttributes redirectAttributes,
    @RequestParam(value = "email_input") String email,
    @RequestParam(value = "password_input") String password,
    @RequestParam(value = "confirm_input") String confirm
  ) {
    session.setAttribute("email", email);
    System.out.println(email);
    System.out.println(password);
    System.out.println(confirm);

    System.out.println(!password.equals(confirm));
    if (!password.equals(confirm)) {
      redirectAttributes.addFlashAttribute(
        "confirm",
        "Las contraseñas no coinciden"
      );
      return "redirect:/formulario";
    }

    Usuario newUser = new Usuario(email, password);

    usuarioService.createUsuario(newUser);
    redirectAttributes.addFlashAttribute("created", "Registro Exitoso");

    return "redirect:/formulario";
  }
}
