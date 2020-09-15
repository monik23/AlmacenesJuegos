/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.business;

import com.prueba.tecnica.projectalmacenesjuegos.entities.Almacenes;
import com.prueba.tecnica.projectalmacenesjuegos.entities.Clientes;
import com.prueba.tecnica.projectalmacenesjuegos.entities.Facturas;
import com.prueba.tecnica.projectalmacenesjuegos.entities.Juegos;
import com.prueba.tecnica.projectalmacenesjuegos.persistence.AlmacenesFacadeLocal;
import com.prueba.tecnica.projectalmacenesjuegos.persistence.ClientesFacadeLocal;
import com.prueba.tecnica.projectalmacenesjuegos.persistence.FacturasFacadeLocal;
import com.prueba.tecnica.projectalmacenesjuegos.persistence.JuegosFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Mon
 */
@Stateless
public class almacenjuegoBean implements almacenjuegoBeanLocal {

    @EJB
    private JuegosFacadeLocal juegoFacade;
    
    @EJB
    private ClientesFacadeLocal clienteFacade;
    
    @EJB
    private AlmacenesFacadeLocal almacenFacade;
    
    @EJB
    private FacturasFacadeLocal facturasFacade;

    @Override
    public List<Almacenes> getAlamcenes(){
        return almacenFacade.findAll();
    }
    
    @Override
    public Almacenes getAlmacen(final int id){
        return almacenFacade.find(id);
    }
    
    @Override
    public Clientes getCliente(final int id){
        return clienteFacade.find(id);
    }
    
    @Override
    public Facturas getFactura(final int id){
        return facturasFacade.find(id);
    }
    
    
    @Override
    public Juegos getJuego(final int id){
        return juegoFacade.find(id);
    }
    
    @Override
    public List<Juegos> getJuegoByIdalmacen(Integer idalmace){
        return juegoFacade.findAll();
    }
    
    @Override
    public List<Facturas> getFacturasByalmacen(Integer idalmace){
        return facturasFacade.findAll();
    }
}
