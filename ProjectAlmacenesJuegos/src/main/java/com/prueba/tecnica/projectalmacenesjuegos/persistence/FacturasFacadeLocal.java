/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.persistence;

import com.prueba.tecnica.projectalmacenesjuegos.entities.Facturas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface FacturasFacadeLocal {

    void create(Facturas facturas);

    void edit(Facturas facturas);

    void remove(Facturas facturas);

    Facturas find(Object id);

    List<Facturas> findAll();

    List<Facturas> findRange(int[] range);

    int count();
    
}
