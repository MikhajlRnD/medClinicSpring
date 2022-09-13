package ru.bakulyerov.medClinicSpring.controller;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.bakulyerov.medClinicSpring.model.DTO.CertificatesDTO;
import ru.bakulyerov.medClinicSpring.model.entity.Certificates;
import ru.bakulyerov.medClinicSpring.repository.CertificatesRepository;

import java.util.UUID;

@RestController
@RequestMapping("/certificate")
public class CertifacateController {

    @Autowired
    private CertificatesRepository repository;

    @PostMapping
    public ResponseEntity<Certificates> save(@RequestBody CertificatesDTO certificates){

        return ResponseEntity.ok(Certificates.builder().name(certificates.getName()).build());
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<Certificates> saveAll(@PathVariable UUID uuid){
        return ResponseEntity.ok(repository.findById(uuid).get());
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam @Validated @NotNull UUID uuid){
        repository.deleteById(uuid);
        return ResponseEntity.ok().build();
    }

}
