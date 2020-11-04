package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created By Giancarlo on 11/3/2020
 */
public interface VetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();

}
