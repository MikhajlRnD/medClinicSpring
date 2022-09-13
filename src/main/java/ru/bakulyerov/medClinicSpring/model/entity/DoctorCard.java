package ru.bakulyerov.medClinicSpring.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctor_card")

public class DoctorCard {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private UUID id;
    @Column(name = "card_creation_date")
    private LocalDateTime cardCreationDate;
    @OneToOne
    @JoinColumn(name = "doctorid")
    private Doctor doctor;
    @OneToMany
    @JoinColumn(name = "doctocardid")
    private List<Certificates> certificates;
    @ManyToMany
    @JoinTable(
            name = "doctorcard_to_clinic",
            joinColumns = {@JoinColumn(name = "doctorcardid")},
            inverseJoinColumns = {@JoinColumn(name = "clinicid")})
    private List<Clinic> clinics;
}
