package com.example.miriam.e_tlallan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button farmacia;
    Button doctor;
    Button mall;
    Button restaurante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        farmacia = (Button) findViewById(R.id.btnFarm);
        farmacia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent farmacia = new Intent(MainActivity.this,Farmacia.class);
                startActivity(farmacia);
            }
        });
        mall = (Button) findViewById(R.id.btnMall);
        mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mall = new Intent(MainActivity.this,Mall.class);
                startActivity(mall);
            }
        });

        doctor = (Button)findViewById(R.id.btnDoc);
        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent doctor = new Intent(MainActivity.this,Doctor.class);
                startActivity(doctor);

            }
        });

        restaurante = (Button)findViewById(R.id.btnRes);
        restaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent restaurante = new Intent(MainActivity.this,Restaurante.class);
                startActivity(restaurante);

            }
        });
    }
}
