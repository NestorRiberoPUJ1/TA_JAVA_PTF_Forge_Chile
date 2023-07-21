package com.fecha.fecha.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("dojoName", "Burbank");
    return "index.jsp";
  }

  @RequestMapping("/fecha")
  public String fecha(Model model,HttpSession session) {
    session.setAttribute("email", "nribero@codingdojo.cl");
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(
      "EEEE, 'el' dd 'de' LLLL, YYYY"
    );

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
    model.addAttribute("fecha", formattedDate);
    return "fecha.jsp";
  }

  @RequestMapping("/hora")
  public String hora(Model model,HttpSession session) {
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("hh:mm a");
    String formattedDate = myDateObj.format(myFormatObj);
    model.addAttribute("fecha", formattedDate);
    String email=(String) session.getAttribute("email");
     model.addAttribute("email", email);
    return "fecha.jsp";
  }
}
