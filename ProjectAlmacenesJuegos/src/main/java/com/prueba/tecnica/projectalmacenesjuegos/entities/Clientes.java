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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByIdcliente", query = "SELECT c FROM Clientes c WHERE c.idcliente = :idcliente"),
    @NamedQuery(name = "Clientes.findByTipoidentificacion", query = "SELECT c FROM Clientes c WHERE c.tipoidentificacion = :tipoidentificacion"),
    @NamedQuery(name = "Clientes.findByNumeroidentificacion", query = "SELECT c FROM Clientes c WHERE c.numeroidentificacion = :numeroidentificacion"),
    @NamedQuery(name = "Clientes.findByNombres", query = "SELECT c FROM Clientes c WHERE c.nombres = :nombres"),
    @NamedQuery(name = "Clientes.findByApellidos", query = "SELECT c FROM Clientes c WHERE c.apellidos = :apellidos"),
    @NamedQuery(name = "Clientes.findByFechanacimiento", query = "SELECT c FROM Clientes c WHERE c.fechanacimiento = :fechanacimiento"),
    @NamedQuery(name = "Clientes.findByEdad", query = "SELECT c FROM Clientes c WHERE c.edad = :edad")})
public class Clientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcliente")
    private Integer idcliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoidentificacion")
    private int tipoidentificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroidentificacion")
    private int numeroidentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechanacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad")
    private int edad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcliente", fetch = FetchType.EAGER)
    private List<Facturas> facturasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcliente", fetch = FetchType.EAGER)
    private List<Juegos> juegosList;

    public Clientes() {
    }

    public Clientes(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Clientes(Integer idcliente, int tipoidentificacion, int numeroidentificacion, String nombres, String apellidos, Date fechanacimiento, int edad) {
        this.idcliente = idcliente;
        this.tipoidentificacion = tipoidentificacion;
        this.numeroidentificacion = numeroidentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.edad = edad;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public int getTipoidentificacion() {
        return tipoidentificacion;
    }

    public void setTipoidentificacion(int tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
    }

    public int getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public void setNumeroidentificacion(int numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
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
        hash += (idcliente != null ? idcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idcliente == null && other.idcliente != null) || (this.idcliente != null && !this.idcliente.equals(other.idcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.tecnica.projectalmacenesjuegos.entities.Clientes[ idcliente=" + idcliente + " ]";
    }
    
}
