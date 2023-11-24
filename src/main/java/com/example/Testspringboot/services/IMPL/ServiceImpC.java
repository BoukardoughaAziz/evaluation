package com.example.Testspringboot.services.IMPL;

import com.example.Testspringboot.entities.Contrat;
import com.example.Testspringboot.repositiries.IRepositaryC;
import com.example.Testspringboot.services.IServiceC;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceImpC implements IServiceC {
    final IRepositaryC ConRepositary;

    @Override
    public Contrat ajouterContrat(Contrat c) {
        return  ConRepositary.save(c);
    }

    @Override
    public Contrat getContratBf(int idBf) {
        return this.ConRepositary.getContratPlusAncien(idBf);
    }
}
