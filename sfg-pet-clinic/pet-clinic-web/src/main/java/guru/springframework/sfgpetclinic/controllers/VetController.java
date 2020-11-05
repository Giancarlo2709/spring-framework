package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Giancarlo
 */
@RequestMapping("/vets")
@Controller
public class VetController {

  @RequestMapping({"","/", "/index", "/index.html"})
  public String listVets() {

    return "vets/index";
  }
}