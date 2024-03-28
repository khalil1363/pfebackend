package org.devellopement.pfeback.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Preuve {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ElementCollection
    private List<String> liste; // This could be a list of strings, URLs, etc., depending on your requirements.

    // Constructors
    public Preuve() {}

    public Preuve(List<String> liste) {
        this.liste = liste;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getListe() {
        return liste;
    }

    public void setListe(List<String> liste) {
        this.liste = liste;
    }
}
