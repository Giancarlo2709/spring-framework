package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Interface <b>RecipeService</b>.
 * @author Giancarlo
 */
public interface RecipeService {

  Set<Recipe> getRecipes();
}