package org.devellopement.pfeback.services;

import org.devellopement.pfeback.entities.ContractSponsor;
import org.devellopement.pfeback.repository.ContractSponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractSponsorServiceImpl implements ContractSponsorService {
    @Autowired
    private ContractSponsorRepository contractSponsorRepository;

    @Override
    public List<ContractSponsor> retrieveAllContracts() {
        return contractSponsorRepository.findAll();
    }

    @Override
    public ContractSponsor addContract(ContractSponsor contract) {
        return contractSponsorRepository.save(contract);
    }

    @Override
    public void deleteContract(Long id) {
        contractSponsorRepository.deleteById(id);
    }

    @Override
    public ContractSponsor findContractById(Long id) {
        return contractSponsorRepository.findById(id).orElse(null);
    }

    @Override
    public ContractSponsor updateContract(ContractSponsor contract, Long id) {
        return contractSponsorRepository.findById(id)
                .map(existingContract -> {
                    existingContract.setObjectif(contract.getObjectif());
                    existingContract.setDateStart(contract.getDateStart());
                    existingContract.setDateEnd(contract.getDateEnd());
                    return contractSponsorRepository.save(existingContract);
                }).orElseGet(() -> {
                    contract.setIdContract(id);
                    return contractSponsorRepository.save(contract);
                });
    }
}
