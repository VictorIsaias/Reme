package com.example.reme;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reme.Models.Opcion;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    List<Opcion> opciones;
    Activity contexto;

    public Adapter(List<Opcion> opciones,Activity contexto) {
        this.opciones = opciones;
        this.contexto=contexto;
    }

    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        holder.setData(opciones.get(position));

    }


    @Override
    public int getItemCount() {
        return opciones.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        Opcion o;
        TextView nombre;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.nombre);
            itemView.findViewById(R.id.ir).setOnClickListener(this);
        }

        public void setData(Opcion opcion){
            o=opcion;
            nombre.setText(o.getAlumno().getNombre());
        }


        @Override
        public void onClick(View view) {
            contexto.startActivity(o.getIntent());
        }
    }
}
