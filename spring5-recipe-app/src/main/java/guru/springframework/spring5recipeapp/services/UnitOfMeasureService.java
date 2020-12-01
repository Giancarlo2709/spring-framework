package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Interface <b>UnitOfMeasureService</b>.
 * @author Giancarlo
 */
public interface UnitOfMeasureService {

  Set<UnitOfMeasureCommand> listAllUoms();
}
