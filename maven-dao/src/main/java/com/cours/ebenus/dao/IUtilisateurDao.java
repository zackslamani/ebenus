package com.cours.ebenus.dao;

import com.cours.ebenus.dao.entities.Utilisateur;

import java.util.List;

/**
 *
 * @author ElHadji
 */

public interface IUtilisateurDao {
	
	 public List<Utilisateur> findAllUtilisateurs();

	    public Utilisateur findUtilisateurById(int idUtilisateur);

	    public List<Utilisateur> findUtilisateurByPrenom(String prenom);

	    public List<Utilisateur> findUtilisateurByNom(String nom);

	    public List<Utilisateur> findUtilisateurByEmail(String email);


	    public Utilisateur createUtilisateur(Utilisateur utilisateur);

	    public Utilisateur updateUtilisateur(Utilisateur utilisateur);

	    public boolean deleteUtilisateur(Utilisateur utilisateur);

		/**
		 * Méthode qui retourne une liste de tous les utilisateurs de la database
		 * (ici utilisateursListDataSource) dont le prénom est égal au paramètre
		 * passé
		 *
		 * @param prenom Le prénom des utilisateurs à récupérer
		 * @return Une liste de tous les utilisateurs dont le prénom est égal au
		 * paramètre passé
		 */

}


