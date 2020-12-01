package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.IngredientCommand;

/**
 * Interface <b>IngredientService</b>.
 * @author Giancarlo
 */
public interface IngredientService {

  IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

  IngredientCommand saveIngredientCommand(IngredientCommand command);
}
