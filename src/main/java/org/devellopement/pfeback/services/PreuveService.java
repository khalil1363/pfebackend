package org.devellopement.pfeback.services;

import org.devellopement.pfeback.entities.Preuve;
import java.util.List;

public interface PreuveService {
    List<Preuve> retrieveAllPreuves();
    Preuve addPreuve(Preuve preuve);
    void deletePreuve(Long id);
    Preuve findPreuveById(Long id);
    Preuve updatePreuve(Preuve preuve, Long id);
}
