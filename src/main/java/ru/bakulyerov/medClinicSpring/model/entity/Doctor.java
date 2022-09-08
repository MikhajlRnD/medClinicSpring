package ru.bakulyerov.medClinicSpring.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "doctor")
public class Doctor extends Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Long id;
    @Column(name = "work_experience")
    private Integer workExperience;
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Specialization> specialization;
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Certificates> certificates;
    @ManyToMany
    @JoinTable(
            name = "doctor_to_clinic",
            joinColumns = {@JoinColumn(name = "doctorid")},
            inverseJoinColumns = {@JoinColumn(name = "clinicid")})
    private List<Clinic> clinics;

}
