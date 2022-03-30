package com.example.demo.models;

import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;

@Entity
@Table(name = "servicio")
public class ModelServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String servicio;
    String empresa;
    String vehiculo;

    public ModelServicio() {
    }

    public ModelServicio(int id, String servicio, String empresa, String vehiculo) {
        this.id = id;
        this.servicio = servicio;
        this.empresa = empresa;
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
}
