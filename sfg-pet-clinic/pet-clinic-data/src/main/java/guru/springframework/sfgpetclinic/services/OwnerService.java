package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created By Giancarlo on 11/3/2020
 */
public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);

}
