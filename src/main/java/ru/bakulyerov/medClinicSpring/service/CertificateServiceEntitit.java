package ru.bakulyerov.medClinicSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.bakulyerov.medClinicSpring.model.DTO.CertificatesDTO;
import ru.bakulyerov.medClinicSpring.model.entity.Certificates;
import ru.bakulyerov.medClinicSpring.repository.CertificatesRepository;

import java.util.List;
import java.util.UUID;

public class CertificateServiceEntitit implements CertificateService{
    @Autowired
    private static CertificatesRepository certificatesRepository;

    @Override
    public void create(CertificatesDTO certificatesDTO) {

    }

    @Override
    public void update(UUID id, CertificatesDTO certificatesDTO) {

    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Certificates getById(UUID id) {
        return null;
    }

    @Override
    public List<Certificates> getAll() {
        return null;
    }
}
