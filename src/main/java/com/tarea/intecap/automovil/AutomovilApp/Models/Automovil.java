package com.tarea.intecap.automovil.AutomovilApp.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
public class Automovil implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private Float precio;

    public Automovil(int i, String toyota, String yaris, String negro, String s, int i1){

    }
}
