package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface <b>PetRepository</b>.
 * @author Giancarlo
 */
@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
