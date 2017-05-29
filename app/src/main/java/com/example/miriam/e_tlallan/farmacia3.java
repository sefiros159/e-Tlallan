package com.example.miriam.e_tlallan;

/**
 * Created by Sefir on 28/05/2017.
 */

public class farmacia3
{
   String nombreFarmacia;
    int imagenFarmacia;

    public farmacia3(String nombreFarmacia, int imagenFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
        this.imagenFarmacia = imagenFarmacia;
    }

    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    public void setNombreFarmacia(String nombreFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
    }

    public int getImagenFarmacia() {
        return imagenFarmacia;
    }

    public void setImagenFarmacia(int imagenFarmacia) {
        this.imagenFarmacia = imagenFarmacia;
    }
}
