package com.example.Testspringboot.services;

import com.example.Testspringboot.entities.Beneficiaire;
import com.example.Testspringboot.entities.TypeContrat;

import java.util.Set;

public interface IServiceB {
    public Beneficiaire ajouterBeneficiaire (Beneficiaire bf);
    public Set<Beneficiaire> getBeneficairesByType (TypeContrat typeContrat);

}
