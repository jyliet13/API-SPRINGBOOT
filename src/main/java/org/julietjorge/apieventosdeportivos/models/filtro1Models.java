package org.julietjorge.apieventosdeportivos.models;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table( name = "filtro1")
public class filtro1Models {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "evento_id")
    private Long id;
    @Column
    private String evento_nombre;
    @Column
    private String evento_descripcion;
    @Column
    private LocalDate fecha;
    @Column
    private LocalTime hora;
    @Column
    private int duracion;
    @Column

    private Long instalacion_id;
    @Column
    private String instalacion_nombre;
    @Column( name = "tipo_instalacion")
    private String tipoinstalacion;
    @Column
    private String ubicacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEvento_nombre() {
        return evento_nombre;
    }

    public void setEvento_nombre(String evento_nombre) {
        this.evento_nombre = evento_nombre;
    }

    public String getEvento_descripcion() {
        return evento_descripcion;
    }

    public void setEvento_descripcion(String evento_descripcion) {
        this.evento_descripcion = evento_descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Long getInstalacion_id() {
        return instalacion_id;
    }

    public void setInstalacion_id(Long instalacion_id) {
        this.instalacion_id = instalacion_id;
    }

    public String getInstalacion_nombre() {
        return instalacion_nombre;
    }

    public void setInstalacion_nombre(String instalacion_nombre) {
        this.instalacion_nombre = instalacion_nombre;
    }

    public String getTipo_de_instalacion() {
        return tipoinstalacion;
    }

    public void setTipo_de_instalacion(String tipoinstalacion) {
        this.tipoinstalacion = tipoinstalacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }



}
