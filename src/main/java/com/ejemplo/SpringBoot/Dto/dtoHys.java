package com.ejemplo.SpringBoot.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class dtoHys {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    @NotBlank
    private String color;

    public dtoHys() {
    }

    public dtoHys(String nombre, int porcentaje, String color) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.color = color;
    }
}