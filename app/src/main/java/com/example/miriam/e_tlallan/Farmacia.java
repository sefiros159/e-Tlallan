package com.example.miriam.e_tlallan;

import android.content.Intent;
import android.icu.text.BreakIterator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Farmacia extends AppCompatActivity
{

    public static final List<farmacia3> bd = new ArrayList<>();
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmacia);

        rv = (RecyclerView) findViewById(R.id.card_recycler_view);
        bd.add(new farmacia3("Farmacias del Ahorro", R.drawable.ahorro));
        bd.add(new  farmacia3("Farmacias guadalajara", R.drawable.farm));
        bd.add(new farmacia3("Farmacias Similares", R.drawable.farmsimi));


        actualizaRecycler();


    }
    private void actualizaRecycler()

    {
        rv.setAdapter(new farmacia_Adapter(bd));
        rv.hasFixedSize();
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
    }
}
