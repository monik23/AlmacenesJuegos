/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mon
 */
@Entity
@Table(name = "precio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Precios.findAll", query = "SELECT p FROM Precios p"),
    @NamedQuery(name = "Precios.findByIdprecio", query = "SELECT p FROM Precios p WHERE p.idprecio = :idprecio"),
    @NamedQuery(name = "Precios.findByValor", query = "SELECT p FROM Precios p WHERE p.valor = :valor"),
    @NamedQuery(name = "Precios.findByFechacambio", query = "SELECT p FROM Precios p WHERE p.fechacambio = :fechacambio")})
public class Precios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprecio")
    private Integer idprecio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private float valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechacambio")
    @Temporal(TemporalType.DATE)
    private Date fechacambio;
    @JoinColumn(name = "idjuego", referencedColumnName = "idjuego")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Juegos idjuego;

    public Precios() {
    }

    public Precios(Integer idprecio) {
        this.idprecio = idprecio;
    }

    public Precios(Integer idprecio, float valor, Date fechacambio) {
        this.idprecio = idprecio;
        this.valor = valor;
        this.fechacambio = fechacambio;
    }

    public Integer getIdprecio() {
        return idprecio;
    }

    public void setIdprecio(Integer idprecio) {
        this.idprecio = idprecio;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getFechacambio() {
        return fechacambio;
    }

    public void setFechacambio(Date fechacambio) {
        this.fechacambio = fechacambio;
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
        hash += (idprecio != null ? idprecio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Precios)) {
            return false;
        }
        Precios other = (Precios) object;
        if ((this.idprecio == null && other.idprecio != null) || (this.idprecio != null && !this.idprecio.equals(other.idprecio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.tecnica.projectalmacenesjuegos.entities.Precios[ idprecio=" + idprecio + " ]";
    }
    
}
