package org.devellopement.pfeback.controller;

import org.devellopement.pfeback.entities.ContractSponsor;
import org.devellopement.pfeback.services.ContractSponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/contract-sponsor")
public class ContractSponsorController {
    @Autowired
    private ContractSponsorService contractSponsorService;

    @GetMapping("/retrieve-all-contracts")
    public List<ContractSponsor> getAllContracts() {
        return contractSponsorService.retrieveAllContracts();
    }

    @PostMapping("/add-contract")
    public ContractSponsor addContract(@RequestBody ContractSponsor contract) {
        return contractSponsorService.addContract(contract);
    }

    @DeleteMapping("/remove-contract/{contract-id}")
    public void removeContract(@PathVariable("contract-id") Long id) {
        contractSponsorService.deleteContract(id);
    }

    @GetMapping("/retrieve-contract/{contract-id}")
    public ResponseEntity<ContractSponsor> getContractById(@PathVariable("contract-id") Long id) {
        ContractSponsor contract = contractSponsorService.findContractById(id);
        if (contract != null) {
            return ResponseEntity.ok(contract);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-contract/{contract-id}")
    public ResponseEntity<ContractSponsor> updateContract(@RequestBody ContractSponsor contract, @PathVariable("contract-id") Long id) {
        ContractSponsor updatedContract = contractSponsorService.updateContract(contract, id);
        if (updatedContract != null) {
            return ResponseEntity.ok(updatedContract);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
