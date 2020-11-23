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
import com.cours.ebenus.factory.AbstractDaoFactory;
import com.cours.ebenus.factory.AbstractDaoFactory.FactoryDaoType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ElHadji
 */
public class ServiceFacade implements IServiceFacade {

    private static final Log log = LogFactory.getLog(ServiceFacade.class);
    private final AbstractDaoFactory.FactoryDaoType DEFAULT_IMPLEMENTATION = AbstractDaoFactory.FactoryDaoType.MANUAL_LIST_DAO_FACTORY;

    // On liste toutes les DAO : un DAO pour chaque entité (Utilisateur,Role ect ....)
    private IUtilisateurDao utilisateurDao = null;

    
    private IAnimalDao animalDao = null;
    
    private IGardeurDao gardeurDao = null;
    
    private IProprietaireDao proprietaireDao = null;

    public ServiceFacade() {
        // mettre tous les DAO
        utilisateurDao = AbstractDaoFactory.getFactory(DEFAULT_IMPLEMENTATION).getUtilisateurDao();
        animalDao = AbstractDaoFactory.getFactory(DEFAULT_IMPLEMENTATION).getAnimalDao();
        gardeurDao = AbstractDaoFactory.getFactory(DEFAULT_IMPLEMENTATION).getGardeurDao();
        proprietaireDao = AbstractDaoFactory.getFactory(DEFAULT_IMPLEMENTATION).getProprietaire();
    }

    public ServiceFacade(FactoryDaoType daoType) {
        // mettre tous les DAO
        utilisateurDao = AbstractDaoFactory.getFactory(daoType).getUtilisateurDao();
        animalDao = AbstractDaoFactory.getFactory(daoType).getAnimalDao();
        gardeurDao = AbstractDaoFactory.getFactory(daoType).getGardeurDao();
        proprietaireDao = AbstractDaoFactory.getFactory(daoType).getProprietaire();
        
    }

    @Override
    public IUtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }
    
    @Override
    public IAnimalDao getAnimalDao() {
        return animalDao;
    }

	@Override
	public IGardeurDao getGardeurDao() {
		// TODO Auto-generated method stub
		return gardeurDao;
	}

	@Override
	public IProprietaireDao getProprietaireDao() {
		// TODO Auto-generated method stub
		return proprietaireDao;
	}
    
}
