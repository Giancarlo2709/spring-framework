package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface <b>SpecialityRepository</b>.
 * @author Giancarlo
 */
@Repository
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
