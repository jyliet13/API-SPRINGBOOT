package org.julietjorge.apieventosdeportivos.models;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table( name = "reservas_instalaciones")
public class ReservasModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column
    private LocalDate fecha;

    @Column
    private String franja_horaria;


    @OneToOne
    @JoinColumn(name = "evento_id", unique = true, nullable = true)
    private EventosModels evento_id;

    //falta columna de instalaciones


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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFranja_horaria() {
        return franja_horaria;
    }

    public void setFranja_horaria(String franja_horaria) {
        this.franja_horaria = franja_horaria;
    }

    public EventosModels getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(EventosModels evento_id) {
        this.evento_id = evento_id;
    }
}
