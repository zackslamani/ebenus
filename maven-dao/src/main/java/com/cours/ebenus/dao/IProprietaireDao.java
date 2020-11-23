package com.cours.ebenus.dao;

import java.util.List;


import com.cours.ebenus.dao.entities.Proprietaire;

public interface IProprietaireDao {
	
	 public List<Proprietaire> findAllProprietaires();

	    public Proprietaire findProprietaireById(int idProprietaire);

	    public List<Proprietaire> findProprietaireByPrenom(String prenom);

	    public List<Proprietaire> findProprietaireByNom(String nom);

	    public List<Proprietaire> findProprietaireByEmail(String email);


	    public Proprietaire createProprietaire(Proprietaire proprietaire);

	    public Proprietaire updateProprietaire(Proprietaire proprietaire);

	    public boolean deleteProprietaire(Proprietaire proprietaire);
}
