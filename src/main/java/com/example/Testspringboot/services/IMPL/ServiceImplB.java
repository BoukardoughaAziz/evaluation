package com.example.Testspringboot.services.IMPL;

import com.example.Testspringboot.entities.Beneficiaire;
import com.example.Testspringboot.entities.TypeContrat;
import com.example.Testspringboot.repositiries.IRepositaryA;
import com.example.Testspringboot.repositiries.IRepositaryB;
import com.example.Testspringboot.services.IServiceB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ServiceImplB implements IServiceB {
    final IRepositaryB BenRepositary;
    final IRepositaryA AssRepositary;

    @Override
    public Beneficiaire ajouterBeneficiaire(Beneficiaire bf) {

        return  BenRepositary.save(bf);
    }

    @Override
    public Set<Beneficiaire> getBeneficairesByType(TypeContrat typeContrat) {
        return BenRepositary.getBeneficiaireByTypecontrat(typeContrat);
    }


   /* public float getMontantBf(int cinBf) {
        Beneficiaire beneficiaire = BenRepositary.findBycin(cinBf);

            // Effectuer le calcul nécessaire pour les types de contrat semestriel et mensuel
            float montantAnnuel = 0;
            for (Assurance assurance : beneficiaire.getAssurances()) {
                if (assurance.getContrat().getType().equals("SEMESTRIEL")) {
                    montantAnnuel += assurance.getMontant() * 2;
                } else if (assurance.getContrat().getType().equals("MENSUEL")) {
                    montantAnnuel += assurance.getMontant() * 12;
                } else {
                    montantAnnuel += assurance.getMontant();
                }
            }
            return montantAnnuel;
        } */}



