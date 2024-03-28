package org.devellopement.pfeback.services;

import org.devellopement.pfeback.entities.Preuve;
import org.devellopement.pfeback.repository.PreuveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreuveServiceImpl implements PreuveService {
    @Autowired
    private PreuveRepository preuveRepository;

    @Override
    public List<Preuve> retrieveAllPreuves() {
        return preuveRepository.findAll();
    }

    @Override
    public Preuve addPreuve(Preuve preuve) {
        return preuveRepository.save(preuve);
    }

    @Override
    public void deletePreuve(Long id) {
        preuveRepository.deleteById(id);
    }

    @Override
    public Preuve findPreuveById(Long id) {
        return preuveRepository.findById(id).orElse(null);
    }

    @Override
    public Preuve updatePreuve(Preuve preuve, Long id) {
        return preuveRepository.findById(id)
                .map(existingPreuve -> {
                    existingPreuve.setListe(preuve.getListe());
                    return preuveRepository.save(existingPreuve);
                }).orElseGet(() -> {
                    preuve.setId(id);
                    return preuveRepository.save(preuve);
                });
    }
}
