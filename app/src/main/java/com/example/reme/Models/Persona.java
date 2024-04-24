package com.example.reme.Models;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String telefono;
    private String matricula;

    public Persona(String nombre, String telefono, String matricula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
