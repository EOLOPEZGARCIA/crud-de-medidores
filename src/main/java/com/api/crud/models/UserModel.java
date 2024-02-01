package com.api.crud.models;

import jakarta.persistence.*;

@Entity
@Table(name = "medidores")

public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String numeroMedidor;

    @Column
    private Long numeroServicio;

    @Column
    private String nombreUsuario;

    @Column
    private String direccion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroMedidor() {
        return numeroMedidor;
    }

    public void setNumeroMedidor(String numeroMedidor) {
        this.numeroMedidor = numeroMedidor;
    }

    public Long getNumeroServicio() {
        return numeroServicio;
    }

    public void setNumeroServicio(Long numeroServicio) {
        this.numeroServicio = numeroServicio;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}