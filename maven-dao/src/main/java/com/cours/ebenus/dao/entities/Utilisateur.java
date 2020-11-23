/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.ebenus.dao.entities;

import java.util.Date;

/**
 *
 * @author elhad
 */
public class Utilisateur {

    private static final long serialVersionUID = 1L;
    private Integer idUtilisateur;
    private String civilite;
    private String prenom;
    private String nom;
    private String identifiant;
    private String email;
    private String motPasse;
    private Date dateNaissance;
    private Date dateCreation;
    private Date dateModification;
    private Boolean actif = true;
    private Boolean marquerEffacer = false;
    private Integer version = 0;
    private Integer role;

    public Utilisateur() {
    }

    public Utilisateur(Integer idUtilisateur, String civilite, String prenom, String nom, String identifiant, String email, String motPasse, Date dateNaissance, Date dateCreation, Date dateModification, Boolean actif, Boolean marquerEffacer, Integer version,Integer role) {
        this.idUtilisateur = idUtilisateur;
        this.civilite = civilite;
        this.prenom = prenom;
        this.nom = nom;
        this.identifiant = identifiant;
        this.email = email;
        this.motPasse = motPasse;
        this.dateNaissance = dateNaissance;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
        this.actif = actif;
        this.marquerEffacer = marquerEffacer;
        this.version = version;
        this.role = role;
    }

    public Utilisateur(Integer idUtilisateur, String civilite, String prenom, String nom, String identifiant, String email, String motPasse, Date dateNaissance, Boolean actif, Boolean marquerEffacer, Integer version, Integer role) {
        this(idUtilisateur, civilite, prenom, nom, identifiant, email, motPasse, dateNaissance, null, null, true, false, 0, 0);
    }

    public Utilisateur(Integer idUtilisateur, String civilite, String prenom, String nom, String identifiant, String email, String motPasse, Date dateNaissance, Integer role) {
        this(idUtilisateur, civilite, prenom, nom, identifiant, email, motPasse, dateNaissance, null, null, true, false, 0, 0);
    }

    public Utilisateur(String civilite, String prenom, String nom, String identifiant, String email, String motPasse, Date dateNaissance, Integer role) {
        this(null, civilite, prenom, nom, identifiant,  email, motPasse, dateNaissance, null, null, true, false, 0, 0);
    }


    public Utilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Integer getIdUtilisateur() {
        return (this.idUtilisateur);
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getCivilite() {
        return (this.civilite);
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getPrenom() {
        return (this.prenom);
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return (this.nom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIdentifiant() {
        return (this.identifiant);
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }
    public String getEmail() {
        return (this.email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotPasse() {
        return (this.motPasse);
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public Date getDateNaissance() {
        return (this.dateNaissance);
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateCreation() {
        return (this.dateCreation);
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateModification() {
        return (this.dateModification);
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Boolean isActif() {
        return (this.actif);
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public Boolean isMarquerEffacer() {
        return (this.marquerEffacer);
    }

    public void setMarquerEffacer(Boolean marquerEffacer) {
        this.marquerEffacer = marquerEffacer;
    }

    public Integer getVersion() {
        return (this.version);
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public int getRole() {
        return (this.role);
    }

    public void setRole(Integer role) {
        this.role = role;
    }
    public String toString () {
    	return new String(idUtilisateur +" "+ civilite +" "+ prenom +" "+ nom +" "+ identifiant +" "+ motPasse +" "+ dateNaissance +" "+ dateCreation +" "+ dateCreation +" "+ dateModification +" "+ actif +" "+ marquerEffacer +" "+ version +" "+ role);
    }
    
    public boolean equals(Object obj) {
    	if(obj == this) {
    		return true;
    	}
    	if(obj == null) {
    		return false;
    	}
    	if(obj.getClass() != this.getClass()) {
    		return false;
    	}
    	Utilisateur r = (Utilisateur)obj;
    	if(this.idUtilisateur != r.idUtilisateur) {
    		return false;
    	}
    	return true;
    }
    public int hashCode() {
        return idUtilisateur * civilite.hashCode() * nom.hashCode()* prenom.hashCode() * identifiant.hashCode() * role.hashCode();
    }

}
