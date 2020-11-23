package com.cours.ebenus.dao.entities;

public class Proprietaire {
	

    private static final long serialVersionUID = 1L;
    private Integer idProprietaire;
    private String email;
    private String password;
    private String nom;
    private String prenom;
    private String adresse;
    private Integer codePostal;
    private boolean valid;
    private Integer version = 0;

    public Proprietaire() {
    }
    
    public Proprietaire(Integer idProprietaire, String email, String password, String nom, String prenom, String adresse, Integer codePostal, boolean valid) {
    this.idProprietaire = idProprietaire;
    this.email = email;
    this.password = password;
    this.nom = nom;
    this.prenom = prenom;
    this.adresse = adresse;
    this.codePostal = codePostal;
    this.valid = valid;
    }

	public Integer getIdProprietaire() {
		return idProprietaire;
	}

	public void setIdProprietaire(Integer idProprietaire) {
		this.idProprietaire = idProprietaire;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}