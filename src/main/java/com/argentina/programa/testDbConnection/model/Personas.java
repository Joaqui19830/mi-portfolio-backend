package com.argentina.programa.testDbConnection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Personas {
    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private String titulo;
    private String direccion;
    private String fotoDePerfil;

}
