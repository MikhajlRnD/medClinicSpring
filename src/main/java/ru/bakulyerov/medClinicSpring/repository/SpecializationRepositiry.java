package ru.bakulyerov.medClinicSpring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.bakulyerov.medClinicSpring.model.entity.Specialization;

import java.util.UUID;

public interface SpecializationRepositiry extends CrudRepository<Specialization, UUID> {
}
