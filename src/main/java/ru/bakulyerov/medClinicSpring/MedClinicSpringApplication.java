package ru.bakulyerov.medClinicSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.bakulyerov.medClinicSpring.model.entity.Certificates;
import ru.bakulyerov.medClinicSpring.repository.CertificatesRepository;

import java.util.UUID;

@SpringBootApplication
public class MedClinicSpringApplication {
	@Autowired
	private static CertificatesRepository certificatesRepository;


	public static void main(String[] args) {
		SpringApplication.run(MedClinicSpringApplication.class, args);
		certificatesRepository.save(Certificates.builder().name("surgeon").build());
	}

}
