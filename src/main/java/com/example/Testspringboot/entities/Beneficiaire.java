package com.example.Testspringboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@Entity
public class Beneficiaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idB;
    private int cin;
    private String nom;
    private String prenom;

    private String profession;
    private Float salaire;
@JsonIgnore
@OneToMany(mappedBy = "Beneficiaire" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Assurance>assurances;



    public Set<Assurance> getAssurances() {
        return assurances;
    }

    public void setAssurances(Set<Assurance> assurances) {
        this.assurances = assurances;
    }

    public Long getIdB() {
        return idB;
    }

    public void setIdB(Long idB) {
        this.idB = idB;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Float getSalaire() {
        return salaire;
    }

    public void setSalaire(Float salaire) {
        this.salaire = salaire;
    }
}
