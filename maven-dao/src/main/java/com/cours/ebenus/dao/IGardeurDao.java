package com.cours.ebenus.dao;

import java.util.List;

import com.cours.ebenus.dao.entities.Gardeur;

public interface IGardeurDao {
	
	 public List<Gardeur> findAllGardeurs();

	    public Gardeur findGardeurById(int idGardeur);

	    public List<Gardeur> findGardeurByPrenom(String prenom);

	    public List<Gardeur> findGardeurByNom(String nom);

	    public List<Gardeur> findGardeurByEmail(String email);


	    public Gardeur createGardeur(Gardeur gardeur);

	    public Gardeur updateGardeur(Gardeur gardeur);

	    public boolean deleteGardeur(Gardeur gardeur);

}
