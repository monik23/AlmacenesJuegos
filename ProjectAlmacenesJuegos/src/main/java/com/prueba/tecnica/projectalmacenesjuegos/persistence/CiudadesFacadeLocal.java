/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.persistence;

import com.prueba.tecnica.projectalmacenesjuegos.entities.Ciudades;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface CiudadesFacadeLocal {

    void create(Ciudades ciudades);

    void edit(Ciudades ciudades);

    void remove(Ciudades ciudades);

    Ciudades find(Object id);

    List<Ciudades> findAll();

    List<Ciudades> findRange(int[] range);

    int count();
    
}
