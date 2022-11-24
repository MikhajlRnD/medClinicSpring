package ru.bakulyerov.medClinicSpring.model.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@SuperBuilder


@Entity
@Table(name = "doctor")
public class Doctor extends Human {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    @Column(name = "work_experience")
    private Integer workExperience;
    @ManyToMany
    @JoinTable(name = "doctor_to_specialization",
            joinColumns = {@JoinColumn(name = "doctorid")},
            inverseJoinColumns = {@JoinColumn(name = "specializationid")})
    private List<Specialization> specialization;



}
