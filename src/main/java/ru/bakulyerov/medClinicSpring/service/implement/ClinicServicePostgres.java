/*
package ru.bakulyerov.medClinicSpring.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bakulyerov.medClinicSpring.model.DTO.ClinicDTO;
import ru.bakulyerov.medClinicSpring.model.entity.Clinic;
import ru.bakulyerov.medClinicSpring.repository.ClinicRepositiry;
import ru.bakulyerov.medClinicSpring.service.EntityService;

import java.util.List;
import java.util.UUID;

@Service
public class ClinicServicePostgres implements EntityService<ClinicDTO, Clinic> {
    @Autowired
    private ClinicRepositiry clinicRepositiry;
    @Override
    public void create(ClinicDTO clinicDTO) {
        clinicRepositiry.save(Clinic.builder().name(clinicDTO.getName()).build());

    }

    @Override
    public void update(UUID id, ClinicDTO clinicDTO) {
        clinicRepositiry.save(Clinic.builder().id(id).name(clinicDTO.getName()).build());
    }

    @Override
    public void delete(UUID id) {

        clinicRepositiry.deleteById(id);
    }

    @Override
    public Clinic getById(UUID id) {

        return clinicRepositiry.findById(id).orElse(null);
    }

    @Override
    public List<Clinic> getAll() {

        return (List<Clinic>) clinicRepositiry.findAll();
    }
}
*/
