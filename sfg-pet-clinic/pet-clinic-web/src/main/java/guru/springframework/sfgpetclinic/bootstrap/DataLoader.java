package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;

/**
 * @author Giancarlo
 */
@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;
  private final PetTypeService petTypeService;
  private final SpecialityService specialityService;
  private final VisitService visitService;

  @Autowired
  public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService){
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
    this.specialityService = specialityService;
    this.visitService = visitService;
  }

  @Override
  public void run(String... args) throws Exception {

    int count = petTypeService.findAll().size();

    if(count == 0) {
      loadData();
    }
  }

  private void loadData() {
    PetType dog = new PetType();
    dog.setName("Dog");
    PetType saveDogPetType = petTypeService.save(dog);

    PetType cat = new PetType();
    cat.setName("Cat");
    PetType saveCatPetType = petTypeService.save(cat);

    Speciality radiology = new Speciality();
    radiology.setDescription("Radiology");
    Speciality savedRadiology = specialityService.save(radiology);

    Speciality surgery = new Speciality();
    surgery.setDescription("Surgery");
    Speciality savedSurgery = specialityService.save(surgery);

    Speciality dentistry = new Speciality();
    dentistry.setDescription("Dentistry");
    Speciality savedDentistry = specialityService.save(dentistry);

    Owner owner1 = Owner.builder()
            .firstName("Giancarlo")
            .lastName("Yarleque")
            .address("123 Brickerel")
            .city("Miami")
            .telephone("1231231231234")
            .pets(new HashSet<>())
            .build();

    Pet mikesPet = new Pet();
    mikesPet.setPetType(saveDogPetType);
    mikesPet.setOwner(owner1);
    mikesPet.setBirthDate(LocalDate.now());
    mikesPet.setName("Rosco");

    owner1.getPets().add(mikesPet);

    ownerService.save(owner1);

    Owner owner2 = Owner.builder()
            .firstName("Elvis")
            .lastName("Yarleque")
            .address("Santa Anita 167")
            .city("Lima")
            .telephone("99876542")
            .pets(new HashSet<>())
            .build();

    Pet wishCat = new Pet();
    wishCat.setName("Just Cat");
    wishCat.setOwner(owner2);
    wishCat.setBirthDate(LocalDate.now());
    wishCat.setPetType(saveCatPetType);

    owner2.getPets().add(wishCat);

    ownerService.save(owner2);

    Visit catVisit = new Visit();
    catVisit.setPet(wishCat);
    catVisit.setDate(LocalDate.now());
    catVisit.setDescription("Smeezy Kitty");

    visitService.save(catVisit);

    System.out.println("Loaded Owners.......");

    Vet vet1 = new Vet();
    vet1.setFirstName("Ashley");
    vet1.setLastName("Yarleque");
    vet1.getSpecialities().add(savedRadiology);

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Gabriela");
    vet2.setLastName("Yarleque");
    vet2.getSpecialities().add(savedSurgery);

    vetService.save(vet2);

    System.out.println("Loaded Vets.......");
  }
}
