package com.example.miriam.e_tlallan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mall extends AppCompatActivity {
    private ListView listaMall;
    private String mall[] = {"Bodega Aurrera",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);

        listaMall = (ListView) findViewById(R.id.ListaMall);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mall);
        listaMall.setAdapter(adapter);

        listaMall.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                Intent aurrera = new Intent(Mall.this,Aurrera.class);
                startActivity(aurrera);


            }
        });
    }
}
