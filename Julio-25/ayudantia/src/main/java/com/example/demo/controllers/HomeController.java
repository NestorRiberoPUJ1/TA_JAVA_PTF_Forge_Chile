package com.example.demo.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/fecha")
	public String fecha(Model model) {
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EE,dd 'de' LLLL yyyy HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    model.addAttribute("fecha", formattedDate);
	    return "fecha.jsp";
	}
	
	@GetMapping("/hora")
	public String hora(Model model) {
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    model.addAttribute("hora", formattedDate);
		return "hora.jsp";
	}
	
}
