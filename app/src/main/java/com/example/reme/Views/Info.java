package com.example.reme.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.reme.Models.Persona;
import com.example.reme.R;

public class Info extends AppCompatActivity {
    TextView nombre, telefono,matricula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        nombre=findViewById(R.id.nombre);
        telefono=findViewById(R.id.telefono);
        matricula=findViewById(R.id.matricula);

        Persona p=(Persona) getIntent().getSerializableExtra("Persona");
        assert p != null;
        nombre.setText(p.getNombre());
        telefono.setText(p.getTelefono());
        matricula.setText(p.getMatricula());
    }
}