package ru.bakulyerov.medClinicSpring.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class DoctorCardDTO {
    private DoctorDTO doctorDTO;
    private List<CertificatesDTO> certificatesDTOList;
    private List<ClinicDTO> clinicDTOList;

}
