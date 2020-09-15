/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mon
 */
@Entity
@Table(name = "almacen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Almacenes.findAll", query = "SELECT a FROM Almacenes a"),
    @NamedQuery(name = "Almacenes.findByIdalmacen", query = "SELECT a FROM Almacenes a WHERE a.idalmacen = :idalmacen"),
    @NamedQuery(name = "Almacenes.findByNombre", query = "SELECT a FROM Almacenes a WHERE a.nombre = :nombre")})
public class Almacenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idalmacen")
    private Integer idalmacen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 63)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idalmacen", fetch = FetchType.EAGER)
    private List<Facturas> facturasList;
    @JoinColumns({
        @JoinColumn(name = "idciudad", referencedColumnName = "idciudad"),
        @JoinColumn(name = "idciudad", referencedColumnName = "idciudad")})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Ciudades ciudades;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idalmacen", fetch = FetchType.EAGER)
    private List<Juegos> juegosList;

    public Almacenes() {
    }

    public Almacenes(Integer idalmacen) {
        this.idalmacen = idalmacen;
    }

    public Almacenes(Integer idalmacen, String nombre) {
        this.idalmacen = idalmacen;
        this.nombre = nombre;
    }

    public Integer getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(Integer idalmacen) {
        this.idalmacen = idalmacen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }

    @XmlTransient
    public List<Juegos> getJuegosList() {
        return juegosList;
    }

    public void setJuegosList(List<Juegos> juegosList) {
        this.juegosList = juegosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalmacen != null ? idalmacen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Almacenes)) {
            return false;
        }
        Almacenes other = (Almacenes) object;
        if ((this.idalmacen == null && other.idalmacen != null) || (this.idalmacen != null && !this.idalmacen.equals(other.idalmacen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.tecnica.projectalmacenesjuegos.entities.Almacenes[ idalmacen=" + idalmacen + " ]";
    }
    
}
