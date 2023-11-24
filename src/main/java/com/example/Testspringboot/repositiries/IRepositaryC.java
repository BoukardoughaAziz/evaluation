package com.example.Testspringboot.repositiries;

import com.example.Testspringboot.entities.Contrat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IRepositaryC extends CrudRepository<Contrat,Long> {
    Contrat findByMatricule(String matricule);

    @Query("select c from Contrat c where c.idC in (select a.contrat.idC from Assurance a where a.Beneficiaire.idB =:idBene) ORDER BY  c.dateeffet asc LIMIT 1")
    Contrat getContratPlusAncien(@Param("idBene") int beneficiareid);
}
