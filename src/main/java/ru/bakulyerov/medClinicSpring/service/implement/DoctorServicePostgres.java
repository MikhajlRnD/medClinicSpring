/*
package ru.bakulyerov.medClinicSpring.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bakulyerov.medClinicSpring.model.DTO.DoctorDTO;
import ru.bakulyerov.medClinicSpring.model.DTO.SpecializationDTO;
import ru.bakulyerov.medClinicSpring.model.entity.Doctor;
import ru.bakulyerov.medClinicSpring.model.entity.Specialization;
import ru.bakulyerov.medClinicSpring.repository.DoctorRepositiry;
import ru.bakulyerov.medClinicSpring.repository.SpecializationRepositiry;
import ru.bakulyerov.medClinicSpring.service.EntityService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class DoctorServicePostgres implements EntityService<DoctorDTO, Doctor> {
    @Autowired
    private DoctorRepositiry doctorRepositiry;


    @Override
    public void create(DoctorDTO doctorDTO) {
       */
/* List<Specialization> specializationList = new ArrayList<>();
        for (SpecializationDTO specialization : doctorDTO.getSpecializationDTOList()) {
            specializationRepositiry.
            specializationList.add(Specialization.builder().build());

        }*//*

        doctorRepositiry.save(Doctor.builder()
                .firstName(doctorDTO.getFirstName())
                .lastName(doctorDTO.getMiddleName())
                .lastName(doctorDTO.getFirstName())
                .dateOfBerth(LocalDate.parse(doctorDTO.getDateOfBerth()))
                .workExperience(doctorDTO.getWorkExperience())
                .build());
    }

    @Override
    public void update(UUID id, DoctorDTO doctorDTO) {
        doctorRepositiry.save(Doctor.builder()
                .id(id)
                .firstName(doctorDTO.getFirstName())
                .lastName(doctorDTO.getMiddleName())
                .lastName(doctorDTO.getFirstName())
                .dateOfBerth(LocalDate.parse(doctorDTO.getDateOfBerth()))
                .workExperience(doctorDTO.getWorkExperience())
                .build());
    }

    @Override
    public void delete(UUID id) {
        doctorRepositiry.deleteById(id);
    }

    @Override
    public Doctor getById(UUID id) {
        return doctorRepositiry.findById(id).orElse(null);
    }

    @Override
    public List<Doctor> getAll() {
        return (List<Doctor>) doctorRepositiry.findAll();
    }
}
*/
