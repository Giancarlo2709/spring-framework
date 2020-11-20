package guru.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class <b>IndexController</b>.
 * <p>Controller for index page</p>
 * @author Giancarlo
 */
@Controller
public class IndexController {

  @RequestMapping({"", "/","index"})
  public String getIndexPage() {
    return "index";
  }
}
