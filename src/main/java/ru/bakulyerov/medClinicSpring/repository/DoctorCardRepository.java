package ru.bakulyerov.medClinicSpring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.bakulyerov.medClinicSpring.model.entity.DoctorCard;

import java.util.UUID;

public interface DoctorCardRepository extends CrudRepository<DoctorCard, UUID> {
}
