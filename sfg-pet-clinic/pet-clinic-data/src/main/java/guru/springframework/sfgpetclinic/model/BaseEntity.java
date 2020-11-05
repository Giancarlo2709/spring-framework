package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created By Giancarlo on 11/3/2020
 */
public class BaseEntity implements Serializable {

  private static final long serialVersionUID = -3046570655979223733L;

  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public boolean isNew() {
    return Objects.isNull(this.id);
  }
}
