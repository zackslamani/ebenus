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
import com.cours.ebenus.dao.manual.list.impl.ManualListUtilisateurDao;
import com.cours.ebenus.dao.manual.list.impl.ManuelListAnimalDao;
import com.cours.ebenus.dao.manual.list.impl.ManuelListGardeurDao;
import com.cours.ebenus.dao.manual.list.impl.ManuelListProprietaireDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ElHadji
 */
public class ManualListDaoFactory extends AbstractDaoFactory {

    private static final Log log = LogFactory.getLog(ManualListDaoFactory.class);

    @Override
    public IUtilisateurDao getUtilisateurDao() {
        return new ManualListUtilisateurDao();
    }

	@Override
	public IAnimalDao getAnimalDao() {
		
		return new ManuelListAnimalDao();
	}

	@Override
	public IGardeurDao getGardeurDao() {
		
		return new ManuelListGardeurDao();
	}

	@Override
	public IProprietaireDao getProprietaire() {
		
		return new ManuelListProprietaireDao();
	}
}
