package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.domain.Category;
import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repositories.CategoryRepository;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Class <b>IndexController</b>.
 * <p>Controller for index page</p>
 * @author Giancarlo
 */
@Controller
public class IndexController {

  private CategoryRepository categoryRepository;
  private UnitOfMeasureRepository unitOfMeasureRepository;

  public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
    this.categoryRepository = categoryRepository;
    this.unitOfMeasureRepository = unitOfMeasureRepository;
  }

  @RequestMapping({"", "/","index"})
  public String getIndexPage() {
    Optional<Category> categoryOptional = this.categoryRepository.findByDescription("American");
    Optional<UnitOfMeasure> unitOfMeasureOptional = this.unitOfMeasureRepository.findByDescription("Teaspoon");

    System.out.println("Cat Id is: "+ categoryOptional.get().getId());
    System.out.println("UOM Id is: "+ unitOfMeasureOptional.get().getId());
    return "index";
  }
}
