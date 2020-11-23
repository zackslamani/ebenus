/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.ebenus.service;

import com.cours.ebenus.dao.IAnimalDao;
import com.cours.ebenus.dao.IGardeurDao;
import com.cours.ebenus.dao.IProprietaireDao;
import com.cours.ebenus.dao.IUtilisateurDao;

/**
 *
 * @author ElHadji
 */
public interface IServiceFacade
{
    public IUtilisateurDao getUtilisateurDao();

	public IAnimalDao getAnimalDao();
	
	public IGardeurDao getGardeurDao();
	
	public IProprietaireDao getProprietaireDao();
}
