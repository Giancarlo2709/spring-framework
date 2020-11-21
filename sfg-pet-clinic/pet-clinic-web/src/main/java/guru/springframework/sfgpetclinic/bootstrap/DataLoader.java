package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author Giancarlo
 */
@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;
  private final PetTypeService petTypeService;

  @Autowired
  public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
  }

  @Override
  public void run(String... args) throws Exception {

    PetType dog = new PetType();
    dog.setName("Dog");
    PetType saveDogPetType = petTypeService.save(dog);

    PetType cat = new PetType();
    cat.setName("Cat");
    PetType saveCatPetType = petTypeService.save(cat);

    Owner owner1 = new Owner();
    owner1.setFirstName("Giancarlo");
    owner1.setLastName("Yarleque");
    owner1.setAddress("123 Brickerel");
    owner1.setCity("Miami");
    owner1.setTelephone("1231231231234");

    Pet mikesPet = new Pet();
    mikesPet.setPetType(saveDogPetType);
    mikesPet.setOwner(owner1);
    mikesPet.setBirthDate(LocalDate.now());
    mikesPet.setName("Rosco");

    owner1.getPets().add(mikesPet);

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Elvis");
    owner2.setLastName("Juarez");
    owner2.setAddress("Santa Anita 167");
    owner2.setCity("Lima");
    owner2.setTelephone("99876542");

    Pet wishCat = new Pet();
    wishCat.setName("Just Cat");
    wishCat.setOwner(owner2);
    wishCat.setBirthDate(LocalDate.now());
    wishCat.setPetType(saveCatPetType);

    owner2.getPets().add(wishCat);

    ownerService.save(owner2);

    System.out.println("Loaded Owners.......");

    Vet vet1 = new Vet();
    vet1.setFirstName("Ashley");
    vet1.setLastName("Yarleque");

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Gabriela");
    vet2.setLastName("Yarleque");

    vetService.save(vet2);

    System.out.println("Loaded Vets.......");

  }
}
