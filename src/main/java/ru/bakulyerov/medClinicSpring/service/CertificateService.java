package ru.bakulyerov.medClinicSpring.service;

import ru.bakulyerov.medClinicSpring.model.DTO.CertificatesDTO;
import ru.bakulyerov.medClinicSpring.model.entity.Certificates;
import ru.bakulyerov.medClinicSpring.model.entity.DoctorCard;

import java.util.List;
import java.util.UUID;

public interface CertificateService {
    void create(CertificatesDTO certificatesDTO);

    void update(UUID id, CertificatesDTO certificatesDTO);

    void delete(UUID id);

    Certificates getById(UUID id);

    List<Certificates> getAll();


}
