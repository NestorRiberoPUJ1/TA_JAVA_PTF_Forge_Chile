package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExternalController {

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String root() {
    return "Root Page";
  }

  @RequestMapping(value = "new", method = RequestMethod.GET)
  public String newPage() {
    return "New Page";
  }

  @RequestMapping(value = "search", method = RequestMethod.GET) // /search?country=Brasil&city=Belen
  public String index(
    @RequestParam(value = "country", required = false) String country,
    @RequestParam(value = "city", required = false) String city
  ) {
    return "Ha buscado:  " + country + " " + city;
  }

  @RequestMapping("/search/{pais}/{ciudad}")
  public String lugar(
    @PathVariable("pais") String pais,
    @PathVariable("ciudad") String ciudad
  ) {
    return "Pais: " + pais + ", Ciudad: " + ciudad;
  }
}
