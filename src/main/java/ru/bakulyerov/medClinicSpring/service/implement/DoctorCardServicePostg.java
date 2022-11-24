/*package ru.bakulyerov.medClinicSpring.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bakulyerov.medClinicSpring.model.DTO.DoctorCardDTO;
import ru.bakulyerov.medClinicSpring.model.entity.DoctorCard;
import ru.bakulyerov.medClinicSpring.repository.DoctorRepositiry;
import ru.bakulyerov.medClinicSpring.service.EntityService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Service

public class DoctorCardServicePostg implements EntityService<DoctorCardDTO, DoctorCard> {

    @Autowired
    DoctorRepositiry doctorRepositiry;
    @Override
    public void create(DoctorCardDTO doctorCardDTO) {
    *//*doctorRepositiry.save(DoctorCard.builder()
                    .doctor().certificates().clinics()
                    .cardCreationDate(LocalDateTime.now()).build());*//*
    }

    @Override
    public void update(UUID id, DoctorCardDTO doctorCardDTO) {

    }

    @Override
    public void delete(UUID id) {
        doctorRepositiry.deleteById(id);

    }

    @Override
    public DoctorCard getById(UUID id) {

        return null;
    }

    @Override
    public List<DoctorCard> getAll() {

        return null;
    }
}*/
