package org.devellopement.pfeback.services;

import org.devellopement.pfeback.entities.Sponsor;
import java.util.List;

public interface SponsorService {
    List<Sponsor> retrieveAllSponsors();
    Sponsor addSponsor(Sponsor sponsor);
    void deleteSponsor(Long id);
    Sponsor findSponsorById(Long id);
    Sponsor updateSponsor(Sponsor sponsor, Long id);
}
