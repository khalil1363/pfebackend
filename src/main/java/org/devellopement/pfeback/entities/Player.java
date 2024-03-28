 package org.devellopement.pfeback.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private Date dateOfBirth;
    private String mailAddress;
    private Long discordId;
    private Long whatsappPhoneNumber;
    private String inGameName;
    private Double salary;
    private Date contractStart;
    private Date contractEnd;
    private String countryOfResidence;
    private String jerseySize;
    private String socialMediaLinkFollowers;
    private Long playerId; // Suppose que vous vouliez un identifiant supplémentaire



    public Player() {
    }

    public Player(String fullName, Date dateOfBirth, String mailAddress, Long discordId, Long whatsappPhoneNumber, String inGameName, Double salary, Date contractStart, Date contractEnd, String countryOfResidence, String jerseySize, String socialMediaLinkFollowers, Long playerId) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.mailAddress = mailAddress;
        this.discordId = discordId;
        this.whatsappPhoneNumber = whatsappPhoneNumber;
        this.inGameName = inGameName;
        this.salary = salary;
        this.contractStart = contractStart;
        this.contractEnd = contractEnd;
        this.countryOfResidence = countryOfResidence;
        this.jerseySize = jerseySize;
        this.socialMediaLinkFollowers = socialMediaLinkFollowers;
        this.playerId = playerId;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public Long getDiscordId() {
        return discordId;
    }

    public void setDiscordId(Long discordId) {
        this.discordId = discordId;
    }

    public Long getWhatsappPhoneNumber() {
        return whatsappPhoneNumber;
    }

    public void setWhatsappPhoneNumber(Long whatsappPhoneNumber) {
        this.whatsappPhoneNumber = whatsappPhoneNumber;
    }

    public String getInGameName() {
        return inGameName;
    }

    public void setInGameName(String inGameName) {
        this.inGameName = inGameName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getContractStart() {
        return contractStart;
    }

    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    public Date getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getJerseySize() {
        return jerseySize;
    }

    public void setJerseySize(String jerseySize) {
        this.jerseySize = jerseySize;
    }

    public String getSocialMediaLinkFollowers() {
        return socialMediaLinkFollowers;
    }

    public void setSocialMediaLinkFollowers(String socialMediaLinkFollowers) {
        this.socialMediaLinkFollowers = socialMediaLinkFollowers;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }
}

