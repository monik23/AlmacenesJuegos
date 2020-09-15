/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mon
 */
@Entity
@Table(name = "protagonistas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Protagonistass.findAll", query = "SELECT p FROM Protagonistass p"),
    @NamedQuery(name = "Protagonistass.findByIdprotagonista", query = "SELECT p FROM Protagonistass p WHERE p.idprotagonista = :idprotagonista"),
    @NamedQuery(name = "Protagonistass.findByNombre", query = "SELECT p FROM Protagonistass p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Protagonistass.findByDescripcion", query = "SELECT p FROM Protagonistass p WHERE p.descripcion = :descripcion")})
public class Protagonistass implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprotagonista")
    private Integer idprotagonista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idjuego", referencedColumnName = "idjuego")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Juegos idjuego;

    public Protagonistass() {
    }

    public Protagonistass(Integer idprotagonista) {
        this.idprotagonista = idprotagonista;
    }

    public Protagonistass(Integer idprotagonista, String nombre, String descripcion) {
        this.idprotagonista = idprotagonista;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdprotagonista() {
        return idprotagonista;
    }

    public void setIdprotagonista(Integer idprotagonista) {
        this.idprotagonista = idprotagonista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Juegos getIdjuego() {
        return idjuego;
    }

    public void setIdjuego(Juegos idjuego) {
        this.idjuego = idjuego;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprotagonista != null ? idprotagonista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Protagonistass)) {
            return false;
        }
        Protagonistass other = (Protagonistass) object;
        if ((this.idprotagonista == null && other.idprotagonista != null) || (this.idprotagonista != null && !this.idprotagonista.equals(other.idprotagonista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.tecnica.projectalmacenesjuegos.entities.Protagonistass[ idprotagonista=" + idprotagonista + " ]";
    }
    
}
