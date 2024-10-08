package com.farah.pfa2024.repository;

import com.farah.pfa2024.model.Prestataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrestataireRepository extends JpaRepository<Prestataire,Long> {

    Optional<Prestataire> findByMail(String mail);
}
