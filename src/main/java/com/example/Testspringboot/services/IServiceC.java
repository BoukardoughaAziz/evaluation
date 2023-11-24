package com.example.Testspringboot.services;

import com.example.Testspringboot.entities.Contrat;

public interface IServiceC {
    public Contrat ajouterContrat (Contrat c);
    public Contrat getContratBf (int idBf);
}
