
package com.mycompany.ex2p1_fernandogomez;
public class Planta {
    
    public int cant;
    public int Dias;
    public int costo;
    public int plant;

    public void setPlant(int plant) {
        this.plant = plant;
        
    }

    public int getPlant() {
        return plant;
    }

    public Planta(int cant, int Dias, int costo,int plant) {
        this.cant = cant;
        this.Dias = Dias;
        this.costo = costo;
        this.plant = plant;
    }
       
}
