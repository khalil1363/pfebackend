package org.devellopement.pfeback.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class ContractSponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContract;

    @ElementCollection
    private List<String> objectif;

    @Temporal(TemporalType.DATE)
    private Date dateStart;

    @Temporal(TemporalType.DATE)
    private Date dateEnd;

    // Constructors, getters, and setters
    public ContractSponsor() {}

    public ContractSponsor(List<String> objectif, Date dateStart, Date dateEnd) {
        this.objectif = objectif;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

	public Long getIdContract() {
		return idContract;
	}

	public void setIdContract(Long idContract) {
		this.idContract = idContract;
	}

	public List<String> getObjectif() {
		return objectif;
	}

	public void setObjectif(List<String> objectif) {
		this.objectif = objectif;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

  
}
