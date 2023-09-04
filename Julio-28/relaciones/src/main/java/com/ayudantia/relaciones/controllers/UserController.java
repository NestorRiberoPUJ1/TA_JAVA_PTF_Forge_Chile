package com.ayudantia.relaciones.controllers;

import com.ayudantia.relaciones.models.User;
import com.ayudantia.relaciones.services.MensajesServices;
import com.ayudantia.relaciones.services.UserServices;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

  private final UserServices userServices;
  private final MensajesServices mensajesServices;

  public UserController(
    UserServices userServices,
    MensajesServices mensajesServices
  ) {
    this.userServices = userServices;
    this.mensajesServices = mensajesServices;
  }

  @GetMapping("")
  public String index(
    Model model,
    @Valid @ModelAttribute("user") User user,
    BindingResult result
  ) {
    List<User> users = userServices.buscarTodos();
    model.addAttribute("users", users);
    return "user/index.jsp";
  }

  @PostMapping("")
  public String create(
    Model model,
    @Valid @ModelAttribute("user") User user,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      List<User> users = userServices.buscarTodos();
      model.addAttribute("users", users);
      return "user/index.jsp";
    } else {
      userServices.createUser(user);
      return "redirect:/user";
    }
  }

  @GetMapping("/{id}")
  public String detallar(
    Model model,
    @PathVariable("id") Long id,
    @Valid @ModelAttribute("user") User user,
    BindingResult result
  ) {
    User active_user = userServices.buscarId(id);
    List<User> users = userServices.buscarTodos();

    model.addAttribute("active_user", active_user);
    model.addAttribute("users", users);

    System.out.println(user.getSeguidos());
    return "user/detallar.jsp";
  }

  @PostMapping("/seguir")
  public String agregarSeguidor(
    Model model,
    @Valid @ModelAttribute("user") User user,
    BindingResult result
  ) {
    System.out.println(user);
    User originalUser = userServices.buscarId(user.getId());

    List<User> seguidos = originalUser.getSeguidos();
    seguidos.add(user.getSeguidos().get(0));

    originalUser.setSeguidos(seguidos);

    userServices.createUser(originalUser);

    return "redirect:/user/" + user.getId();
  }
}
