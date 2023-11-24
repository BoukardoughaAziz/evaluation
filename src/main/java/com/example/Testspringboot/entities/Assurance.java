package com.example.Testspringboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Assurance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idA;
    private String designation;
    private Float montant;
@JsonIgnore
    @ManyToOne
    Beneficiaire Beneficiaire;
@JsonIgnore
    @ManyToOne
    Contrat contrat;


    public Long getIdA() {
        return idA;
    }

    public void setIdA(Long idA) {
        this.idA = idA;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public com.example.Testspringboot.entities.Beneficiaire getBeneficiaire() {
        return Beneficiaire;
    }

    public void setBeneficiaire(com.example.Testspringboot.entities.Beneficiaire beneficiaire) {
        Beneficiaire = beneficiaire;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }
}
