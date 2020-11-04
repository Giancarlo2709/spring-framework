package guru.springframework.sfgpetclinic.model;

import java.util.Objects;

/**
 * Created By Giancarlo on 11/3/2020
 */
public class BaseEntity {

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
