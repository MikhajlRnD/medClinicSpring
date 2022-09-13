package ru.bakulyerov.medClinicSpring.model.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "doctor")
public class Doctor extends Human {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private UUID id;
    @Column(name = "work_experience")
    private Integer workExperience;
    @OneToMany
    @JoinColumn(name = "doctorid")
    private List<Specialization> specialization;



}
