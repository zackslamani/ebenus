package com.cours.ebenus.dao.entities;

public class Gardeur {

    private static final long serialVersionUID = 1L;
    private Integer idGardeur;
    private String email;
    private String password;
    private String nom;
    private String prenom;
    private String adresse;
    private Integer codePostal;
    private double prix;
    private String typeLogement;
    private boolean chat;
    private boolean chien;
    private boolean valid;
    private Integer version = 0;

    public Gardeur() {
    }

    public Gardeur(Integer idGardeur,String email, String password, String nom, String prenom, String adresse, Integer codePostal, double prix, String typeLogement, Boolean chat, Boolean chien, Boolean valid ) {
        this.idGardeur = idGardeur;
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.prix = prix;
        this.typeLogement = typeLogement;
        this.chat = chat;
        this.chien = chien; 
        this.valid = valid; 
    
    }

	public Integer getIdGardeur() {
		return idGardeur;
	}

	public void setIdGardeur(Integer idGardeur) {
		this.idGardeur = idGardeur;
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

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getTypeLogement() {
		return typeLogement;
	}

	public void setTypeLogement(String typeLogement) {
		this.typeLogement = typeLogement;
	}

	public boolean isChat() {
		return chat;
	}

	public void setChat(boolean chat) {
		this.chat = chat;
	}

	public boolean isChien() {
		return chien;
	}

	public void setChien(boolean chien) {
		this.chien = chien;
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
