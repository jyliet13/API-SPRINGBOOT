package org.julietjorge.apieventosdeportivos.models;

import jakarta.persistence.*;

@Entity
@Table( name = "instalaciones_deportivas")
public class InstalacionesModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private  String nombre;

    @Column
    private  String tipo_instalacion;

    @Column
    private  String ubicacion;

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

    public String getTipo_instalacion() {
        return tipo_instalacion;
    }

    public void setTipo_instalacion(String tipo_instalacion) {
        this.tipo_instalacion = tipo_instalacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
