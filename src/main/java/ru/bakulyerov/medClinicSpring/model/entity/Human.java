package ru.bakulyerov.medClinicSpring.model.entity;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
@Data
@MappedSuperclass
public abstract class Human {
    private String name;
    private String patronymic;
    private  String surName;
    private LocalDate dateOfBerth;
}
