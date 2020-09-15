/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.persistence;

import com.prueba.tecnica.projectalmacenesjuegos.entities.Precios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface PreciosFacadeLocal {

    void create(Precios precios);

    void edit(Precios precios);

    void remove(Precios precios);

    Precios find(Object id);

    List<Precios> findAll();

    List<Precios> findRange(int[] range);

    int count();
    
}
