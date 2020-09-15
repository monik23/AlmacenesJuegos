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
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Mon
 */
@Local
public interface almacenjuegoBeanLocal {
    public List<Almacenes> getAlamcenes();
    
    public Almacenes getAlmacen(final int id);
    
    public Clientes getCliente(final int id);
    
    public Facturas getFactura(final int id);
    
    public Juegos getJuego(final int id);
    
    public List<Juegos> getJuegoByIdalmacen(Integer idalmace);
    
    public List<Facturas> getFacturasByalmacen(Integer idalmace);
}
