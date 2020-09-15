/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.persistence;

import com.prueba.tecnica.projectalmacenesjuegos.entities.Juegos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface JuegosFacadeLocal {

    void create(Juegos juegos);

    void edit(Juegos juegos);

    void remove(Juegos juegos);

    Juegos find(Object id);

    List<Juegos> findAll();

    List<Juegos> findRange(int[] range);

    int count();
    
}
