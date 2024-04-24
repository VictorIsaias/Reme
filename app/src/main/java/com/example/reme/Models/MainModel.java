package com.example.reme.Models;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.example.reme.Views.Info;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainModel {
    private List<Opcion> opciones;

    public List<Opcion> getOpciones() {
        return opciones;
    }

    private Persona alumno;

    public Persona getAlumno() {
        return alumno;
    }

    public MainModel(Activity context){
        alumno=new Persona("Victor","8714446301","23170003");


        Intent intentInfo=new Intent(context, Info.class);
        intentInfo.putExtra("Persona",(Serializable) alumno);
        opciones=new ArrayList<>();

        opciones.add(new Opcion(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com")),alumno));
        opciones.add(new Opcion(intentInfo,alumno));
        opciones.add(new Opcion(new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 37.7749,-122.4194")),alumno));
        opciones.add(new Opcion(new Intent(Intent.ACTION_CALL, Uri.parse("tel: "+alumno.getTelefono())),alumno));
        opciones.add(new Opcion(new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+alumno.getTelefono())),alumno));

    }
}
