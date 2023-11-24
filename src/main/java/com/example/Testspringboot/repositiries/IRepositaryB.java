package com.example.Testspringboot.repositiries;

import com.example.Testspringboot.entities.Beneficiaire;
import com.example.Testspringboot.entities.TypeContrat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface IRepositaryB extends CrudRepository<Beneficiaire,Long> {
    Beneficiaire findBycin(int cinBf);
@Query("select b from Beneficiaire b join b.assurances a where a.contrat.type=:typecontrat")
    Set<Beneficiaire>  getBeneficiaireByTypecontrat(@Param("typecontrat")TypeContrat typeContrat);

}

