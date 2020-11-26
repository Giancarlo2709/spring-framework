package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class <b>IndexController</b>.
 * <p>Controller for index page</p>
 * @author Giancarlo
 */
@Controller
public class IndexController {

  private final RecipeService recipeService;

  public IndexController(RecipeService recipeService) {
    this.recipeService = recipeService;
  }

  @RequestMapping({"", "/","index"})
  public String getIndexPage(Model model) {
    model.addAttribute("recipes", this.recipeService.getRecipes());
    return "index";
  }
}
