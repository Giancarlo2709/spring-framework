package guru.springframework.spring5recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class <b>UnitOfMeasureCommand</b>.
 * @author Giancarlo
 */
@Setter
@Getter
@NoArgsConstructor
public class UnitOfMeasureCommand {

  private Long id;
  private String description;
}
