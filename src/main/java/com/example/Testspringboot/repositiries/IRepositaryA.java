package com.example.Testspringboot.repositiries;

import com.example.Testspringboot.entities.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IRepositaryA extends JpaRepository<Assurance,Long> {

    @Query("SELECT SUM(CASE WHEN a.contrat.type = 'SEMESTRIEL' THEN a.montant * 2 WHEN a.contrat.type = 'MENSUEL' THEN a.montant * 12 ELSE a.montant END) FROM Assurance a INNER JOIN a.Beneficiaire b WHERE b.cin = :cinBf")
    Float getMontantBf(@Param("cinBf") int cinBf);
}
