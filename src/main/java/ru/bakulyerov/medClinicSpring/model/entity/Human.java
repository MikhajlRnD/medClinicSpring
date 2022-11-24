package ru.bakulyerov.medClinicSpring.model.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
@Data
@MappedSuperclass
@SuperBuilder
public abstract class Human {
    private String firstName;
    private String middleName;
    private  String lastName;
    private LocalDate dateOfBerth;
}
