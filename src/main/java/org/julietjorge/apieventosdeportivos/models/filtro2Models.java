package org.julietjorge.apieventosdeportivos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "filtro2")
public class filtro2Models {

    @Id
    @Column(name = "instalacion_id" )
    private Long id;

    @Column
    private String instalacion_nombre;
    @Column(name = "tipo_instalacion")
    private String tipo_de_instalacion;
    @Column
    private String ubicacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstalacion_nombre() {
        return instalacion_nombre;
    }

    public void setInstalacion_nombre(String instalacion_nombre) {
        this.instalacion_nombre = instalacion_nombre;
    }

    public String getTipo_de_instalacion() {
        return tipo_de_instalacion;
    }

    public void setTipo_de_instalacion(String tipo_de_instalacion) {
        this.tipo_de_instalacion = tipo_de_instalacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
