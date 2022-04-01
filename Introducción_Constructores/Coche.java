package com.company;

public class Coche {

    public String nombre,modelo;
    public float precio;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }

    public String getFullData(){
        return (this.getNombre() + " " + this.getModelo() + " " + this.getPrecio());
    }

}
