package org.devellopement.pfeback.repository;

import org.devellopement.pfeback.entities.ContractSponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractSponsorRepository extends JpaRepository<ContractSponsor, Long> {
}
