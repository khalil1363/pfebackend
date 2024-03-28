package org.devellopement.pfeback.controller;

import org.devellopement.pfeback.entities.Sponsor;
import org.devellopement.pfeback.services.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/sponsor")
public class SponsorController {
    @Autowired
    private SponsorService sponsorService;

    @GetMapping("/retrieve-all-sponsors")
    public List<Sponsor> getAllSponsors() {
        return sponsorService.retrieveAllSponsors();
    }

    @PostMapping("/add-sponsor")
    public Sponsor addSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.addSponsor(sponsor);
    }

    @DeleteMapping("/remove-sponsor/{sponsor-id}")
    public void removeSponsor(@PathVariable("sponsor-id") Long id) {
        sponsorService.deleteSponsor(id);
    }

    @GetMapping("/retrieve-sponsor/{sponsor-id}")
    public ResponseEntity<Sponsor> getSponsorById(@PathVariable("sponsor-id") Long id) {
        Sponsor sponsor = sponsorService.findSponsorById(id);
        if (sponsor != null) {
            return ResponseEntity.ok(sponsor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-sponsor/{sponsor-id}")
    public ResponseEntity<Sponsor> updateSponsor(@RequestBody Sponsor sponsor, @PathVariable("sponsor-id") Long id) {
        Sponsor updatedSponsor = sponsorService.updateSponsor(sponsor, id);
        if (updatedSponsor != null) {
            return ResponseEntity.ok(updatedSponsor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
