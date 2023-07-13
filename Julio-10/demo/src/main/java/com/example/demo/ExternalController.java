package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
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

  @RequestMapping("/search/{pais}/{ciudad}/{barrio}")
  public String lugar(
    @PathVariable("pais") String pais,
    @PathVariable("ciudad") String ciudad,
    @PathVariable("barrio") String barrio
  ) {
    return "Pais: " + pais + ", Ciudad: " + ciudad + ", Barrio: " + barrio;
  }

  @RequestMapping("/cursos/{curso}/{modulo}/{unidad}")
  public String curso(
    @PathVariable("curso") String curso,
    @PathVariable("modulo") int modulo,
    @PathVariable("unidad") int unidad
  ) {
    return "Curso: " + curso + ", Ciudad: " + modulo + ", Barrio: " + unidad;
  }
}
