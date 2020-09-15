/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.web.MB;

import java.io.Serializable;
import javax.ejb.EJB;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import com.prueba.tecnica.projectalmacenesjuegos.business.almacenjuegoBeanLocal;
import com.prueba.tecnica.projectalmacenesjuegos.entities.Almacenes;
import com.prueba.tecnica.projectalmacenesjuegos.entities.Facturas;
import com.prueba.tecnica.projectalmacenesjuegos.entities.Clientes;

@Named(value = "facturasMB")
@ViewScoped
public class FacturasMB implements Serializable {

    @EJB
    private almacenjuegoBeanLocal almacenJuego;  

    private List<Facturas> factura;
    
    private Almacenes almacen;

    private Clientes cliente;

    private Integer idalmace;
    
    public FacturasMB() {
    }

    public void loadTanques() {
        factura = almacenJuego.getFacturasByalmacen(idalmace);
        almacen = almacenJuego.getAlmacen(idalmace);
    }

    public almacenjuegoBeanLocal getAlmacenJuego() {
        return almacenJuego;
    }

    public void setAlmacenJuego(almacenjuegoBeanLocal almacenJuego) {
        this.almacenJuego = almacenJuego;
    }

    public List<Facturas> getFactura() {
        return factura;
    }

    public void setFactura(List<Facturas> factura) {
        this.factura = factura;
    }

    public Almacenes getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacenes almacen) {
        this.almacen = almacen;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Integer getIdalmace() {
        return idalmace;
    }

    public void setIdalmace(Integer idalmace) {
        this.idalmace = idalmace;
    }

     
    
}
