package org.devellopement.pfeback.controller;

import org.devellopement.pfeback.entities.Preuve;
import org.devellopement.pfeback.services.PreuveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/preuve")
public class PreuveController {
    @Autowired
    private PreuveService preuveService;

    @GetMapping("/retrieve-all-preuves")
    public List<Preuve> getAllPreuves() {
        return preuveService.retrieveAllPreuves();
    }

    @PostMapping("/add-preuve")
    public Preuve addPreuve(@RequestBody Preuve preuve) {
        return preuveService.addPreuve(preuve);
    }

    @DeleteMapping("/remove-preuve/{preuve-id}")
    public void removePreuve(@PathVariable("preuve-id") Long id) {
        preuveService.deletePreuve(id);
    }

    @GetMapping("/retrieve-preuve/{preuve-id}")
    public ResponseEntity<Preuve> getPreuveById(@PathVariable("preuve-id") Long id) {
        Preuve preuve = preuveService.findPreuveById(id);
        if (preuve != null) {
            return ResponseEntity.ok(preuve);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update-preuve/{preuve-id}")
    public ResponseEntity<Preuve> updatePreuve(@RequestBody Preuve preuve, @PathVariable("preuve-id") Long id) {
        Preuve updatedPreuve = preuveService.updatePreuve(preuve, id);
        if (updatedPreuve != null) {
            return ResponseEntity.ok(updatedPreuve);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
