package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created By Giancarlo on 11/3/2020
 */
public interface PetService {

  Vet findById(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();
}
