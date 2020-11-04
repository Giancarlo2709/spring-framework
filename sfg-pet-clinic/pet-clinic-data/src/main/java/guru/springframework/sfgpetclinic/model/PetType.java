package guru.springframework.sfgpetclinic.model;

/**
 * Created By Giancarlo on 11/3/2020
 */
public class PetType extends BaseEntity {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
