package org.devellopement.pfeback.services;

import org.devellopement.pfeback.entities.ContractSponsor;
import java.util.List;

public interface ContractSponsorService {
    List<ContractSponsor> retrieveAllContracts();
    ContractSponsor addContract(ContractSponsor contract);
    void deleteContract(Long id);
    ContractSponsor findContractById(Long id);
    ContractSponsor updateContract(ContractSponsor contract, Long id);
}
