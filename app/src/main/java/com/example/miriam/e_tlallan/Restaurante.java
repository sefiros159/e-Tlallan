package com.example.miriam.e_tlallan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.miriam.e_tlallan.R.layout.activity_restaurant__urban;

public class Restaurante extends AppCompatActivity {

    private ListView listaRest;

    private String restaurantes[] = {"-Urban Food"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        listaRest = (ListView) findViewById(R.id.listaRest);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,restaurantes);
        listaRest.setAdapter(adapter);

        listaRest.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                Intent Urban = new Intent(Restaurante.this,restaurant_Urban.class);
                startActivity(Urban);

            }
        });
    }
}
