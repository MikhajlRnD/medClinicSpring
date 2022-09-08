package ru.bakulyerov.medClinicSpring.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
    private UUID cardNumber;
    @Column(name = "card_creation_date")
    private LocalDateTime cardCreationDate;
    @OneToOne
    @JoinColumn(name = "doctorid")
    private Doctor doctor;

}
