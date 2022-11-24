package ru.bakulyerov.medClinicSpring.controller;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.bakulyerov.medClinicSpring.model.DTO.CertificatesDTO;
import ru.bakulyerov.medClinicSpring.model.entity.Certificates;
import ru.bakulyerov.medClinicSpring.service.EntityService;

import java.util.UUID;

@RestController
@RequestMapping("/certificate")
public class CertifacateController {

    @Autowired
    private EntityService certificateService;

    @PostMapping
    public ResponseEntity<Certificates> save(@RequestBody CertificatesDTO certificates){
        certificateService.create(certificates);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<Object> get(@PathVariable UUID uuid){
        return ResponseEntity.ok(certificateService.getById(uuid));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam @Validated @NotNull UUID uuid){
        certificateService.delete(uuid);
        return ResponseEntity.ok().build();
    }

}
