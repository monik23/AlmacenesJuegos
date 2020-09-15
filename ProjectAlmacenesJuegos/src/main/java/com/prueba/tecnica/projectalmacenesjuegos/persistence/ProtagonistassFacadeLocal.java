/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.persistence;

import com.prueba.tecnica.projectalmacenesjuegos.entities.Protagonistass;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface ProtagonistassFacadeLocal {

    void create(Protagonistass protagonistass);

    void edit(Protagonistass protagonistass);

    void remove(Protagonistass protagonistass);

    Protagonistass find(Object id);

    List<Protagonistass> findAll();

    List<Protagonistass> findRange(int[] range);

    int count();
    
}
