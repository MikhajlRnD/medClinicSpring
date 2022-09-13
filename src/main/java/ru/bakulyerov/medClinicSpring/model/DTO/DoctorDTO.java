package ru.bakulyerov.medClinicSpring.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.bakulyerov.medClinicSpring.model.entity.Specialization;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class DoctorDTO {
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBerth;
    private Integer workExperience;
    private List<SpecializationDTO> specializationDTOList;
}
