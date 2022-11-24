/*
package ru.bakulyerov.medClinicSpring.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bakulyerov.medClinicSpring.model.DTO.SpecializationDTO;
import ru.bakulyerov.medClinicSpring.model.entity.Specialization;
import ru.bakulyerov.medClinicSpring.repository.SpecializationRepositiry;
import ru.bakulyerov.medClinicSpring.service.EntityService;

import java.util.List;
import java.util.UUID;

@Service
public class SpecializationServicePostgres implements EntityService<SpecializationDTO, Specialization> {
    @Autowired
    private SpecializationRepositiry specializationRepositiry;

    @Override
    public void create(SpecializationDTO specializationDTO) {
        */
/*specializationRepositiry.save(Specialization.builder()
                .specialization(specializationDTO.getName()).build());*//*

    }

    @Override
    public void update(UUID id, SpecializationDTO specializationDTO) {
       */
/* specializationRepositiry.save(Specialization.builder()
                .specialization(specializationDTO.getName()).build());*//*

    }

    @Override
    public void delete(UUID id) {

        specializationRepositiry.deleteById(id);
    }

    @Override
    public Specialization getById(UUID id) {

        return specializationRepositiry.findById(id).orElse(null);
    }

    @Override
    public List<Specialization> getAll() {

        return (List<Specialization>) specializationRepositiry.findAll();
    }
}
*/
