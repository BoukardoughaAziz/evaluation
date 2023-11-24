package com.example.Testspringboot.services;

import com.example.Testspringboot.entities.Assurance;

public interface IServiceA {
    public Assurance ajouterAssurance (Assurance a, int cinBf, String matricule);
    public float getMontantBf (int cinBf);
}
