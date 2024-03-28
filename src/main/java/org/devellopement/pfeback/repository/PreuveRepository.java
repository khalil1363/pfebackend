package org.devellopement.pfeback.repository;

import org.devellopement.pfeback.entities.Preuve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreuveRepository extends JpaRepository<Preuve, Long> {
}
