package guru.springframework.spring5recipeapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class <b>UnitOfMeasure</b>.
 * @author Giancarlo
 */
@Getter
@Setter
@Entity
public class UnitOfMeasure {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
}
