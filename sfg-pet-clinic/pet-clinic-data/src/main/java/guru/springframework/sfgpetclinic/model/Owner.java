package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Class <b>Owner</b>.
 * <p>Owner class entity</p>
 * @author Giancarlo
 */
public class Owner extends Person {

  private Set<Pet> pets;

  public Set<Pet> getPets() {
    return pets;
  }

  public void setPets(Set<Pet> pets) {
    this.pets = pets;
  }
}
