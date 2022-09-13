package ru.bakulyerov.medClinicSpring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.bakulyerov.medClinicSpring.model.entity.Clinic;

import java.util.UUID;

public interface ClinicRepositiry extends CrudRepository<Clinic, UUID> {
}
