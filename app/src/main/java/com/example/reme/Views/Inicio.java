package com.example.reme.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.example.reme.R;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        CountDownTimer count = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Inicio.this.startActivity(new Intent(Inicio.this, MainActivity.class));
                Inicio.this.finish();
            }
        };
        count.start();
    }
}