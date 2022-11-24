package ru.bakulyerov.medClinicSpring.service;

import ru.bakulyerov.medClinicSpring.model.entity.DoctorCard;

import java.util.List;
import java.util.UUID;

public interface EntityService<T, U> {
    void create(T card);

    void update(UUID id, T card);

    void delete(UUID id);

    U getById(UUID id);

    List<U> getAll();
}
