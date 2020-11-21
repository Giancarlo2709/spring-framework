package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Class <b>Vet</b>.
 * <p>Entity Class Vet</p>
 * @author Giancarlo
 */
public class Vet extends Person {

  private Set<Speciality> specialities;

  public Set<Speciality> getSpecialities() {
    return specialities;
  }

  public void setSpecialities(Set<Speciality> specialities) {
    this.specialities = specialities;
  }
}
