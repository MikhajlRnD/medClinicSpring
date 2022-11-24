package ru.bakulyerov.medClinicSpring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bakulyerov.medClinicSpring.model.entity.Doctor;

import java.util.UUID;
@Repository

public interface DoctorRepositiry extends CrudRepository<Doctor, UUID> {
}
