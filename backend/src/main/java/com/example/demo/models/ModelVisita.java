package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "visita")
public class ModelVisita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String nombre;
    String apellido;
    String calle;
    String casa;

    public ModelVisita() {
    }

    public ModelVisita(int id, String nombre, String apellido, String calle, String casa) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.casa = casa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
}
