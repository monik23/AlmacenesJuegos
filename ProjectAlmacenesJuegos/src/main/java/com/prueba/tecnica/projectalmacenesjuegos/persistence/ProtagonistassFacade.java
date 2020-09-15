/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.persistence;

import com.prueba.tecnica.projectalmacenesjuegos.entities.Protagonistass;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mon
 */
@Stateless
public class ProtagonistassFacade extends AbstractFacade<Protagonistass> implements ProtagonistassFacadeLocal {
    @PersistenceContext(unitName = "com.prueba.tecnica_ProjectAlmacenesJuegos_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProtagonistassFacade() {
        super(Protagonistass.class);
    }
    
}
