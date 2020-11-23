/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.ebenus.dao.manual.list.impl;

import com.cours.ebenus.dao.IUtilisateurDao;
import com.cours.ebenus.dao.entities.Utilisateur;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ElHadji
 */
public class ManualListUtilisateurDao /*extends AbstractListDao<Utilisateur>*/ implements IUtilisateurDao {

    private static final Log log = LogFactory.getLog(ManualListUtilisateurDao.class);
    private List<Utilisateur> utilisateursListDataSource = null;
	@Override
	public List<Utilisateur> findAllUtilisateurs() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Utilisateur findUtilisateurById(int idUtilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Utilisateur> findUtilisateurByPrenom(String prenom) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Utilisateur> findUtilisateurByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Utilisateur> findUtilisateurByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Utilisateur createUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return false;
	}

}
