package guru.springframework.spring5recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class <b>NotesCommand</b>.
 * @author Giancarlo
 */
@Setter
@Getter
@NoArgsConstructor
public class NotesCommand {

  private Long id;
  private String recipeNotes;
}
