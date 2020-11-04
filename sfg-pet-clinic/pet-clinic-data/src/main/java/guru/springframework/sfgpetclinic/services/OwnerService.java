package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created By Giancarlo on 11/3/2020
 */
public interface OwnerService {

  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Owner save(Owner owner);

  Set<Owner> findAll();

}
