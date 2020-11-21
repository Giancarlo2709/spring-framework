package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

/**
 * @author Giancarlo
 * @since 11/08/2020
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

  private final SpecialityService specialityService;

  @Autowired
  public VetServiceMap(SpecialityService specialityService) {
    this.specialityService = specialityService;
  }

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);
  }

  @Override
  public Vet save(Vet object) {

    if(object.getSpecialities().size() > 0) {
      object.getSpecialities().forEach(speciality -> {
        if(Objects.isNull(speciality.getId())) {
          Speciality savedSpeciality = specialityService.save(speciality);
          speciality.setId(savedSpeciality.getId());
        }
      });
    }

    return super.save(object);
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }
}
