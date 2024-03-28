package org.devellopement.pfeback.services;

import org.devellopement.pfeback.entities.Sponsor;
import org.devellopement.pfeback.repository.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorServiceImpl implements SponsorService {
    @Autowired
    private SponsorRepository sponsorRepository;

    @Override
    public List<Sponsor> retrieveAllSponsors() {
        return sponsorRepository.findAll();
    }

    @Override
    public Sponsor addSponsor(Sponsor sponsor) {
        return sponsorRepository.save(sponsor);
    }

    @Override
    public void deleteSponsor(Long id) {
        sponsorRepository.deleteById(id);
    }

    @Override
    public Sponsor findSponsorById(Long id) {
        return sponsorRepository.findById(id).orElse(null);
    }

    @Override
    public Sponsor updateSponsor(Sponsor sponsor, Long id) {
        return sponsorRepository.findById(id)
                .map(existingSponsor -> {
                    existingSponsor.setNameSponsor(sponsor.getNameSponsor());
                    existingSponsor.setDetailContractuels(sponsor.getDetailContractuels());
                    existingSponsor.setTermFinancieres(sponsor.getTermFinancieres());
                    return sponsorRepository.save(existingSponsor);
                }).orElseGet(() -> {
                    sponsor.setIdSponsor(id);
                    return sponsorRepository.save(sponsor);
                });
    }
}
