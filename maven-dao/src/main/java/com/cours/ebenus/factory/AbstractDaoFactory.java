/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.ebenus.factory;

import com.cours.ebenus.dao.IAnimalDao;
import com.cours.ebenus.dao.IGardeurDao;
import com.cours.ebenus.dao.IProprietaireDao;
import com.cours.ebenus.dao.IUtilisateurDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.cours.ebenus.dao.entities.*;
/**
 *
 * @author ElHadji
 */
public abstract class AbstractDaoFactory {

    public static String className = AbstractDaoFactory.class.getName();
    private static final Log log = LogFactory.getLog(AbstractDaoFactory.class);

    public enum FactoryDaoType {

        MANUAL_LIST_DAO_FACTORY, MANUAL_ARRAY_DAO_FACTORY, MANUAL_MAP_DAO_FACTORY, JDBC_DAO_FACTORY;
    }

    public abstract IUtilisateurDao getUtilisateurDao();
    
    public abstract IAnimalDao getAnimalDao();
    
    public abstract IGardeurDao getGardeurDao();
    
    public abstract IProprietaireDao getProprietaire();
    
    
    
    

    
    public static AbstractDaoFactory getFactory(FactoryDaoType daoType) {
        AbstractDaoFactory factory = null;
        
        switch (daoType) {
        case MANUAL_LIST_DAO_FACTORY:
        	factory = new ManualListDaoFactory();
        	break;
        	default:
        		factory = null;
        }
    	
    	return factory;
    }

}
