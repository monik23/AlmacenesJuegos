/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.tecnica.projectalmacenesjuegos.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mon
 */
@Entity
@Table(name = "juego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juegos.findAll", query = "SELECT j FROM Juegos j"),
    @NamedQuery(name = "Juegos.findByIdjuego", query = "SELECT j FROM Juegos j WHERE j.idjuego = :idjuego"),
    @NamedQuery(name = "Juegos.findByNombre", query = "SELECT j FROM Juegos j WHERE j.nombre = :nombre"),
    @NamedQuery(name = "Juegos.findByEstado", query = "SELECT j FROM Juegos j WHERE j.estado = :estado"),
    @NamedQuery(name = "Juegos.findByFechainicio", query = "SELECT j FROM Juegos j WHERE j.fechainicio = :fechainicio"),
    @NamedQuery(name = "Juegos.findByFechafin", query = "SELECT j FROM Juegos j WHERE j.fechafin = :fechafin"),
    @NamedQuery(name = "Juegos.findByNombredirector", query = "SELECT j FROM Juegos j WHERE j.nombredirector = :nombredirector"),
    @NamedQuery(name = "Juegos.findByProductor", query = "SELECT j FROM Juegos j WHERE j.productor = :productor"),
    @NamedQuery(name = "Juegos.findByMarca", query = "SELECT j FROM Juegos j WHERE j.marca = :marca"),
    @NamedQuery(name = "Juegos.findByA\u00f1o", query = "SELECT j FROM Juegos j WHERE j.a\u00f1o = :a\u00f1o"),
    @NamedQuery(name = "Juegos.findByTecnologia", query = "SELECT j FROM Juegos j WHERE j.tecnologia = :tecnologia")})
public class Juegos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjuego")
    private Integer idjuego;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    @Column(name = "fechafin")
    @Temporal(TemporalType.DATE)
    private Date fechafin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "nombredirector")
    private String nombredirector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "productor")
    private String productor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "marca")
    private String marca;
    @Column(name = "a\u00f1o")
    @Temporal(TemporalType.DATE)
    private Date año;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "tecnologia")
    private String tecnologia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjuego", fetch = FetchType.EAGER)
    private List<Precios> preciosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjuego", fetch = FetchType.EAGER)
    private List<Facturas> facturasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjuego", fetch = FetchType.EAGER)
    private List<Protagonistass> protagonistassList;
    @JoinColumn(name = "idalmacen", referencedColumnName = "idalmacen")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Almacenes idalmacen;
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Clientes idcliente;

    public Juegos() {
    }

    public Juegos(Integer idjuego) {
        this.idjuego = idjuego;
    }

    public Juegos(Integer idjuego, String nombre, boolean estado, String nombredirector, String productor, String marca, String tecnologia) {
        this.idjuego = idjuego;
        this.nombre = nombre;
        this.estado = estado;
        this.nombredirector = nombredirector;
        this.productor = productor;
        this.marca = marca;
        this.tecnologia = tecnologia;
    }

    public Integer getIdjuego() {
        return idjuego;
    }

    public void setIdjuego(Integer idjuego) {
        this.idjuego = idjuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getNombredirector() {
        return nombredirector;
    }

    public void setNombredirector(String nombredirector) {
        this.nombredirector = nombredirector;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @XmlTransient
    public List<Precios> getPreciosList() {
        return preciosList;
    }

    public void setPreciosList(List<Precios> preciosList) {
        this.preciosList = preciosList;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    @XmlTransient
    public List<Protagonistass> getProtagonistassList() {
        return protagonistassList;
    }

    public void setProtagonistassList(List<Protagonistass> protagonistassList) {
        this.protagonistassList = protagonistassList;
    }

    public Almacenes getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(Almacenes idalmacen) {
        this.idalmacen = idalmacen;
    }

    public Clientes getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjuego != null ? idjuego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Juegos)) {
            return false;
        }
        Juegos other = (Juegos) object;
        if ((this.idjuego == null && other.idjuego != null) || (this.idjuego != null && !this.idjuego.equals(other.idjuego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.tecnica.projectalmacenesjuegos.entities.Juegos[ idjuego=" + idjuego + " ]";
    }
    
}
