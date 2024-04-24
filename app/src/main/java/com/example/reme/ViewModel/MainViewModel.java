package com.example.reme.ViewModel;

import android.app.Activity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.reme.Models.MainModel;
import com.example.reme.Models.Opcion;
import com.example.reme.Models.Persona;

import java.util.List;

public class MainViewModel extends ViewModel {
    private MutableLiveData<List<Opcion>> opciones = new MutableLiveData<>();
    public LiveData<List<Opcion>> getOpciones() {
        return opciones;
    }


    public void setOpciones(Activity context) {
        MainModel model=new MainModel(context);
        opciones.setValue(model.getOpciones());

    }

}
