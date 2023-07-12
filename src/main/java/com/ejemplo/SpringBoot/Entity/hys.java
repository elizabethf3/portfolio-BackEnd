package com.ejemplo.SpringBoot.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class hys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int porcentaje;
    private String color;

    public hys() {
    }

    public hys(String nombre, int porcentaje, String color) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.color = color;
    } 
}