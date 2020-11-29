package guru.springframework.spring5recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryTest {

  Category category;

  @Before
  public void setup() {
    category = new Category();
  }

  @Test
  public void getId() {
    Long idValue = 4L;
    category.setId(idValue);
    assertEquals(idValue, category.getId());
  }

  @Test
  public void getDescription() {
  }

  @Test
  public void getRecipes() {
  }
}