package ru.bakulyerov.medClinicSpring.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bakulyerov.medClinicSpring.model.DTO.CertificatesDTO;
import ru.bakulyerov.medClinicSpring.model.entity.Certificates;
import ru.bakulyerov.medClinicSpring.repository.CertificatesRepository;
import ru.bakulyerov.medClinicSpring.service.EntityService;

import java.util.List;
import java.util.UUID;
@Service

public class CertificateServicePostgres implements EntityService<CertificatesDTO, Certificates> {
    @Autowired
    private CertificatesRepository certificatesRepository;

    @Override
    public void create(CertificatesDTO certificatesDTO) {
        certificatesRepository.save(Certificates.builder().name(certificatesDTO.getName()).build());

    }

    @Override
    public void update(UUID id, CertificatesDTO certificatesDTO) {
        certificatesRepository.save(Certificates.builder().id(id).name(certificatesDTO.getName()).build());
    }

    @Override
    public void delete(UUID id) {
    certificatesRepository.deleteById(id);
    }

    @Override
    public Certificates getById(UUID id) {

        return certificatesRepository.findById(id).orElse(null);
    }

    @Override
    public List<Certificates> getAll() {

        return (List<Certificates>) certificatesRepository.findAll();
    }
}
