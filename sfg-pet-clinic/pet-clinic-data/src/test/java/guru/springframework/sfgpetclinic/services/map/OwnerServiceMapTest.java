package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class OwnerServiceMapTest {

  OwnerServiceMap ownerServiceMap;

  final Long ownerId = 1L;
  final String lastName = "Smith";

  @BeforeEach
  void setUp() {
    ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
    ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
  }

  @Test
  void findAll() {
    Set<Owner> owners = ownerServiceMap.findAll();
    assertEquals(1, owners.size());
  }

  @Test
  void deleteById() {
    ownerServiceMap.deleteById(ownerId);
    assertEquals(0, ownerServiceMap.findAll().size());
  }

  @Test
  void delete() {
    ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
    assertEquals(0, ownerServiceMap.findAll().size());
  }

  @Test
  void saveExistingId() {
    long id = 2L;
    Owner owner2 = Owner.builder().id(id).build();
    Owner saveOwner = ownerServiceMap.save(owner2);
    assertEquals(id, saveOwner.getId());
  }

  @Test
  void saveNoId() {
    Owner saveOwner = ownerServiceMap.save(Owner.builder().build());
    assertNotNull(saveOwner);
    assertNotNull(saveOwner.getId());
  }

  @Test
  void findById() {
    Owner owner = ownerServiceMap.findById(ownerId);
    assertEquals(ownerId, owner.getId());
  }

  @Test
  void findByLastName() {
    Owner smith = ownerServiceMap.findByLastName(lastName);
    assertNotNull(smith);
    assertEquals(ownerId, smith.getId());
  }
}