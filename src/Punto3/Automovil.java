package Punto3;

import java.util.Arrays;

public class Automovil {
    private String Marca;
    private int Año;
    private String Modelo;
    private Llanta[] Llantas;
    private Puerta[] Puertas;
    private Motor Motor;
    
    public Automovil(Llanta[] l, Puerta[] p, Motor m){
        if(l.length!=4)
            return;
        if(p.length<2)
            return;
        this.Llantas = l;
        this.Puertas = p;
        this.Motor = m;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "Marca=" + Marca + ", A\u00f1o=" + Año + ", Modelo=" 
                + Modelo + ", Llantas=" + Arrays.toString(Llantas) + ", Puertas=" 
                + Arrays.toString(Puertas) + ", Motor=" + Motor + '}';
    }
    
    
}
