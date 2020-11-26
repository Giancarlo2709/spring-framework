package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface <b>RecipeRepository</b>.
 * @author Giancarlo
 */
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
