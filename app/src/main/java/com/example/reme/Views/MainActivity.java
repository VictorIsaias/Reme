package com.example.reme.Views;

import static android.Manifest.permission.CALL_PHONE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import com.example.reme.Models.Opcion;
import com.example.reme.Models.Persona;
import com.example.reme.R;
import com.example.reme.ViewModel.MainViewModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);




        if(checkSelfPermission(TELEPHONY_SERVICE)== PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(this,new String[]{CALL_PHONE},200);
        }


        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.setOpciones(this);
        viewModel.getOpciones().observe(this, new Observer<List<Opcion>>() {
            @Override
            public void onChanged(List<Opcion> lista) {
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(new com.example.reme.Adapter(lista,MainActivity.this));

            }
        });


    }
}