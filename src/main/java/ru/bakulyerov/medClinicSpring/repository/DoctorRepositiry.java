package ru.bakulyerov.medClinicSpring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.bakulyerov.medClinicSpring.model.entity.Doctor;

import java.util.UUID;

public interface DoctorRepositiry extends CrudRepository<Doctor, UUID> {
}
