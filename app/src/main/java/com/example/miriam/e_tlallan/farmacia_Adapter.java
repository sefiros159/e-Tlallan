package com.example.miriam.e_tlallan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Sefir on 28/05/2017.
 */

public class farmacia_Adapter extends RecyclerView.Adapter<farmacia_Adapter.VistaFarmacia>
{
    private List<farmacia3> datos;
    ImageButton boton;

    public farmacia_Adapter(List<farmacia3> datos)
    {
        this.datos = datos;
    }

    @Override
    public VistaFarmacia onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.farmacia2,parent,false);
        VistaFarmacia vistaFarmacia = new VistaFarmacia(v);
        return vistaFarmacia;
    }

    @Override
    public void onBindViewHolder(farmacia_Adapter.VistaFarmacia holder, int position)
    {
        farmacia3 farmacia3_1 = datos.get(position);
        //para cada  negocio que se quiere cambiar de recyclerview
        holder.tvNombre.setText(farmacia3_1.getNombreFarmacia());
        holder.tvImagen.setImageResource(farmacia3_1.getImagenFarmacia());
    }


    @Override
    public int getItemCount()
    {
        return datos.size();
    }


    public static class VistaFarmacia extends RecyclerView.ViewHolder
    {
        TextView tvNombre;
        ImageView tvImagen;




        public VistaFarmacia(View itemView)
        {
            super(itemView);

            tvNombre = (TextView) itemView.findViewById(R.id.textFarmacias);
            tvImagen = (ImageView) itemView.findViewById(R.id.imagenFarmacia);



        }


    }

}