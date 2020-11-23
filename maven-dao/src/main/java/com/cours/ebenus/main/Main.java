/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.ebenus.main;

import com.cours.ebenus.dao.entities.Animal;
import com.cours.ebenus.service.IServiceFacade;
import com.cours.ebenus.service.ServiceFacade;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author elhad
 */
public class Main {

    private static final Log log = LogFactory.getLog(Main.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.print("coucou");
        IServiceFacade serviceFacade = new ServiceFacade();
        Animal animal = new Animal();
        System.out.print(serviceFacade.getAnimalDao().findAllAnimals());

    }
}
