package com.company;

public class Perros {

    public String raza,color;
    public int edad;

    public Perros(String raza,String color,int edad){
        this.setRaza(raza);
        this.setColor(color);
        this.setEdad(edad);
    }

    public String getRaza(){
        return this.raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
