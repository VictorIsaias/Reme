package com.example.reme.Models;

import android.content.Intent;

public class Opcion {

    private Intent intent;
    private Persona alumno;

    public Opcion(Intent intent, Persona alumno) {
        this.intent = intent;
        this.alumno = alumno;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public Persona getAlumno() {
        return alumno;
    }

    public void setAlumno(Persona alumno) {
        this.alumno = alumno;
    }
}
