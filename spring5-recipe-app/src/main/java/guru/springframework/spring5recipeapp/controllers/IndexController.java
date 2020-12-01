package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Class <b>IndexController</b>.
 * <p>Controller for index page</p>
 * @author Giancarlo
 */
@Slf4j
@Controller
public class IndexController {

  private final RecipeService recipeService;

  public IndexController(RecipeService recipeService) {
    this.recipeService = recipeService;
  }

  @GetMapping({"", "/","index"})
  public String getIndexPage(Model model) {
    log.debug("Getting Index Page");
    model.addAttribute("recipes", this.recipeService.getRecipes());
    return "index";
  }
}
