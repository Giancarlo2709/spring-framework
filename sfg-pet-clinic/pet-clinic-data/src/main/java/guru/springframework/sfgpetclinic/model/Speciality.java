package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Class <b>Speciality</b>.
 * <p>Entity class Speciality</p>
 * @author Giancarlo
 */
@Entity
@Table(name = "specialties")
public class Speciality  extends BaseEntity {

  @Column(name = "description")
  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
