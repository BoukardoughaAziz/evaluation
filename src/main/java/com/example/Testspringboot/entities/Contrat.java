package com.example.Testspringboot.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idC;
    private String matricule;
    private LocalDate dateeffet;
    @Enumerated(EnumType.STRING)
    private TypeContrat type;

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public LocalDate getDateeffet() {
        return dateeffet;
    }

    public void setDateeffet(LocalDate dateeffet) {
        this.dateeffet = dateeffet;
    }

    public TypeContrat getType() {
        return type;
    }

    public void setType(TypeContrat type) {
        this.type = type;
    }
}
