package guru.springframework.sfgpetclinic.model;

/**
 * Class <b>Speciality</b>.
 * <p>Entity class Speciality</p>
 * @author Giancarlo
 */
public class Speciality  extends BaseEntity {

  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
