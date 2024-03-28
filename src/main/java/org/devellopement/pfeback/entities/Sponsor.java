package org.devellopement.pfeback.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSponsor;

    @Column(name = "nameSponsor")
    private String nameSponsor;

    @Column(name = "detailContractuels")
    private String detailContractuels;

    @Column(name = "termFinancieres")
    private String termFinancieres;

    // Constructors
    public Sponsor() {}

    public Sponsor(String nameSponsor, String detailContractuels, String termFinancieres) {
        this.nameSponsor = nameSponsor;
        this.detailContractuels = detailContractuels;
        this.termFinancieres = termFinancieres;
    }

    // Getters and Setters
    public Long getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(Long idSponsor) {
        this.idSponsor = idSponsor;
    }

    public String getNameSponsor() {
        return nameSponsor;
    }

    public void setNameSponsor(String nameSponsor) {
        this.nameSponsor = nameSponsor;
    }

    public String getDetailContractuels() {
        return detailContractuels;
    }

    public void setDetailContractuels(String detailContractuels) {
        this.detailContractuels = detailContractuels;
    }

    public String getTermFinancieres() {
        return termFinancieres;
    }

    public void setTermFinancieres(String termFinancieres) {
        this.termFinancieres = termFinancieres;
    }
}
