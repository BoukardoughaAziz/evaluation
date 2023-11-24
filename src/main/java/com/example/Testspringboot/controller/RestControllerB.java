package com.example.Testspringboot.controller;

import com.example.Testspringboot.entities.Beneficiaire;
import com.example.Testspringboot.entities.TypeContrat;
import com.example.Testspringboot.services.IServiceB;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequiredArgsConstructor

@Slf4j
@RestController
@RequestMapping("/Ben")
public class RestControllerB {
    private final IServiceB benServices;
    @PostMapping("/addB")
    public Beneficiaire addB(@RequestBody Beneficiaire bf){
        return benServices.ajouterBeneficiaire(bf);
    }

    @GetMapping("/get/{type}")
    public Set<Beneficiaire> getBeneficairesByType(@PathVariable("type") TypeContrat typeContrat) {
        return benServices.getBeneficairesByType(typeContrat);
    }


    }
